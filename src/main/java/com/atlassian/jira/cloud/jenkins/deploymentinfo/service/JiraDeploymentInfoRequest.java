package com.atlassian.jira.cloud.jenkins.deploymentinfo.service;

import hudson.scm.ChangeLogSet;
import org.jenkinsci.plugins.workflow.job.WorkflowRun;

import javax.annotation.Nullable;
import java.util.Set;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class JiraDeploymentInfoRequest {

    private final String site;
    private final String environmentId;
    private final String environmentName;
    private final String environmentType;
    private final WorkflowRun deployment;
    private final String state;
    private final Set<String> serviceIds;
    private final Set<String> changeSet;
    private final Boolean enableGating;

    public JiraDeploymentInfoRequest(
            @Nullable final String site,
            final String environmentId,
            final String environmentName,
            final String environmentType,
            @Nullable final String state,
            final Set<String> serviceIds,
            final Set<String> changeSet,
            final Boolean enableGating,
            final WorkflowRun deployment) {
        this.site = site;
        this.environmentId = environmentId;
        this.environmentName = environmentName;
        this.environmentType = environmentType;
        this.state = state;
        this.deployment = requireNonNull(deployment);
        this.serviceIds = serviceIds;
        this.changeSet = changeSet;
        this.enableGating = enableGating;
    }

    @Nullable
    public String getSite() {
        return site;
    }

    public WorkflowRun getDeployment() {
        return deployment;
    }

    public String getEnvironmentId() {
        return environmentId;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public String getEnvironmentType() {
        return environmentType;
    }

    @Nullable
    public String getState() {
        return state;
    }

    public Set<String> getServiceIds() {
        return serviceIds;
    }

    public Set<String> getChangeSet() {
        return changeSet;
    }

    public Boolean getEnableGating() {
        return enableGating;
    }
}

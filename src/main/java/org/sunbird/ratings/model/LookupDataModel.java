package org.sunbird.ratings.model;

import java.util.UUID;

public class LookupDataModel {
    private String activityId;
    private String review;
    private Float rating;
    private String updatedOn;
    private String activityType;
    private String userId;
    private Float instructorquality;
    private Float contentrelevance;
    private Float courseengagement;
    private Float assessmentsquality;

    public LookupDataModel() {

    }

    public LookupDataModel(String activityId, String review, Float rating, UUID updatedOn, String activityType, String userId, Float assementsQuality, Float contentRelevance,Float courseEngagement,Float instructorQuality) {
        this.activityId = activityId;
        this.review = review;
        this.rating = rating;
        this.updatedOn = updatedOn.toString();
        this.activityType = activityType;
        this.userId = userId;
        this.assessmentsquality = assementsQuality;
        this.contentrelevance = contentRelevance;
        this.courseengagement = courseEngagement;
        this.instructorquality = instructorQuality;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }


    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(UUID updatedOn) {
        this.updatedOn = updatedOn.toString();
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Float getInstructorquality() {
        return instructorquality;
    }

    public void setInstructorquality(Float instructorquality) {
        this.instructorquality = instructorquality;
    }

    public Float getContentrelevance() {
        return contentrelevance;
    }

    public void setContentrelevance(Float contentrelevance) {
        this.contentrelevance = contentrelevance;
    }

    public Float getCourseengagement() {
        return courseengagement;
    }

    public void setCourseengagement(Float courseengagement) {
        this.courseengagement = courseengagement;
    }

    public Float getAssessmentsquality() {
        return assessmentsquality;
    }

    public void setAssessmentsquality(Float assessmentsquality) {
        this.assessmentsquality = assessmentsquality;
    }

    @Override
    public String toString() {
        return "LookupDataModel{" +
                "activityId='" + activityId + '\'' +
                ", review='" + review + '\'' +
                ", rating=" + rating +
                ", updatedOn='" + updatedOn + '\'' +
                ", activityType='" + activityType + '\'' +
                ", userId='" + userId + '\'' +
                ", assessmentsQuality=" + assessmentsquality +
                ", contentRelevance=" + contentrelevance +
                ", courseEngagement=" + courseengagement +
                ", assessmentsQuality=" + assessmentsquality +
                '}';
    }
}

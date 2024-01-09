package org.sunbird.ratings.model;

import java.util.UUID;

public class LookupDataModel {
    private String activityId;
    private String review;
    private Float rating;
    private String updatedOn;
    private String activityType;
    private String userId;
    private Float instructorQuality;
    private Float contentRelevance;
    private Float courseEngagement;
    private Float assessmentsQuality;

    public LookupDataModel() {

    }

    public LookupDataModel(String activityId, String review, Float rating, UUID updatedOn, String activityType, String userId, Float assementsQuality, Float contentRelevance,Float courseEngagement,Float instructorQuality) {
        this.activityId = activityId;
        this.review = review;
        this.rating = rating;
        this.updatedOn = updatedOn.toString();
        this.activityType = activityType;
        this.userId = userId;
        this.assessmentsQuality = assementsQuality;
        this.contentRelevance = contentRelevance;
        this.courseEngagement = courseEngagement;
        this.instructorQuality = instructorQuality;
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

    public Float getInstructorQuality() {
        return instructorQuality;
    }

    public void setInstructorQuality(Float instructorQuality) {
        this.instructorQuality = instructorQuality;
    }

    public Float getContentRelevance() {
        return contentRelevance;
    }

    public void setContentRelevance(Float contentRelevance) {
        this.contentRelevance = contentRelevance;
    }

    public Float getCourseEngagement() {
        return courseEngagement;
    }

    public void setCourseEngagement(Float courseEngagement) {
        this.courseEngagement = courseEngagement;
    }

    public Float getAssessmentsQuality() {
        return assessmentsQuality;
    }

    public void setAssessmentsQuality(Float assessmentsQuality) {
        this.assessmentsQuality = assessmentsQuality;
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
                ", assessmentsQuality=" + assessmentsQuality +
                ", contentRelevance=" + contentRelevance +
                ", courseEngagement=" + courseEngagement +
                ", assessmentsQuality=" + assessmentsQuality +
                '}';
    }
}

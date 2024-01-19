package org.sunbird.ratings.model;

import java.sql.Timestamp;

public class LookupResponse {
    private String activityId;
    private String review;
    private String rating;
    private Long updatedon;
    private String updatedOnUUID;
    private String activityType;
    private String userId;
    private String firstName;
    private String instructorquality;
    private String contentrelevance;
    private String courseengagement;
    private String assessmentsquality;

    public LookupResponse(String activityId, String review, String rating, Long updatedon,String updatedOnUUID, String activityType, String userId, String firstName, String assementsQuality, String contentRelevance, String courseEngagement, String instructorQuality) {
        this.activityId = activityId;
        this.review = review;
        this.rating = rating;
        this.updatedon = updatedon;
        this.updatedOnUUID = updatedOnUUID;
        this.activityType = activityType;
        this.userId = userId;
        this.firstName = firstName;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Long getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(Long updatedon) {
        this.updatedon = updatedon;
    }

    public String getUpdatedOnUUID() {
        return updatedOnUUID;
    }

    public void setUpdatedOnUUID(String updatedOnUUID) {
        this.updatedOnUUID = updatedOnUUID;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInstructorquality() {
        return instructorquality;
    }

    public void setInstructorquality(String instructorquality) {
        this.instructorquality = instructorquality;
    }

    public String getContentrelevance() {
        return contentrelevance;
    }

    public void setContentrelevance(String contentrelevance) {
        this.contentrelevance = contentrelevance;
    }

    public String getCourseengagement() {
        return courseengagement;
    }

    public void setCourseengagement(String courseengagement) {
        this.courseengagement = courseengagement;
    }

    public String getAssessmentsquality() {
        return assessmentsquality;
    }

    public void setAssessmentsquality(String assessmentsquality) {
        this.assessmentsquality = assessmentsquality;
    }
}

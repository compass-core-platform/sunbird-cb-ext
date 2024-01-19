package org.sunbird.ratings.model;

public class RequestRating {
    private String activityId;
    private String userId;
    private String activityType;
    private Float rating;
    private String review ;
    private String comment;
    private Float instructorQuality;
    private Float contentRelevance;
    private Float courseEngagement;
    private Float assessmentsQuality;

    public String getRecommended() {
        return recommended;
    }

    public void setRecommended(String recommended) {
        this.recommended = recommended;
    }

    private String commentBy;
    private String recommended;


    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentBy() {
        return commentBy;
    }

    public void setCommentBy(String commentBy) {
        this.commentBy = commentBy;
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
}

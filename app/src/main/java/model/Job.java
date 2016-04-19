package model;

/**
 * Created by Michal on 2016-04-19.
 */
public class Job {

    private String __status;
    private String customerName;
    private String distance;
    private String jobDate;
    private String extras;
    private int orderDuration;
    private String orderId;
    private String orderTime;
    private String paymentMethod;
    private String price;
    private int recurrency;
    private String jobCity;
    private String jobLatitude;
    private String jobLongtitude;
    private int jobPostalCode;
    private String jobStreet;
    private String status;

    public Job(String __status, String customerName, String distance, String jobDate, String extras, int orderDuration, String orderId, String orderTime, String paymentMethod, String price, int recurrency, String jobCity, String jobLatitude, String jobLongtitude, int jobPostalCode, String jobStreet, String status) {
        this.__status = __status;
        this.customerName = customerName;
        this.distance = distance;
        this.jobDate = jobDate;
        this.extras = extras;
        this.orderDuration = orderDuration;
        this.orderId = orderId;
        this.orderTime = orderTime;
        this.paymentMethod = paymentMethod;
        this.price = price;
        this.recurrency = recurrency;
        this.jobCity = jobCity;
        this.jobLatitude = jobLatitude;
        this.jobLongtitude = jobLongtitude;
        this.jobPostalCode = jobPostalCode;
        this.jobStreet = jobStreet;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Job{" +
                "__status='" + __status + '\'' +
                ", customerName='" + customerName + '\'' +
                ", distance='" + distance + '\'' +
                ", jobDate='" + jobDate + '\'' +
                ", extras='" + extras + '\'' +
                ", orderDuration=" + orderDuration +
                ", orderId='" + orderId + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", price='" + price + '\'' +
                ", recurrency=" + recurrency +
                ", jobCity='" + jobCity + '\'' +
                ", jobLatitude='" + jobLatitude + '\'' +
                ", jobLongtitude='" + jobLongtitude + '\'' +
                ", jobPostalCode=" + jobPostalCode +
                ", jobStreet='" + jobStreet + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String get__status() {
        return __status;
    }

    public void set__status(String __status) {
        this.__status = __status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getJobDate() {
        return jobDate;
    }

    public void setJobDate(String jobDate) {
        this.jobDate = jobDate;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public int getOrderDuration() {
        return orderDuration;
    }

    public void setOrderDuration(int orderDuration) {
        this.orderDuration = orderDuration;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getRecurrency() {
        return recurrency;
    }

    public void setRecurrency(int recurrency) {
        this.recurrency = recurrency;
    }

    public String getJobCity() {
        return jobCity;
    }

    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    public String getJobLatitude() {
        return jobLatitude;
    }

    public void setJobLatitude(String jobLatitude) {
        this.jobLatitude = jobLatitude;
    }

    public String getJobLongtitude() {
        return jobLongtitude;
    }

    public void setJobLongtitude(String jobLongtitude) {
        this.jobLongtitude = jobLongtitude;
    }

    public int getJobPostalCode() {
        return jobPostalCode;
    }

    public void setJobPostalCode(int jobPostalCode) {
        this.jobPostalCode = jobPostalCode;
    }

    public String getJobStreet() {
        return jobStreet;
    }

    public void setJobStreet(String jobStreet) {
        this.jobStreet = jobStreet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

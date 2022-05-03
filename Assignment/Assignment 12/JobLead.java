public class JobLead {
    private String companyName;
    private String contactName;
    private String contactNumber;
    private String jobTitle;
    private String jobDescription;


    public JobLead(String companyName, String contactName, String contactNumber, String jobTitle, String jobDescription) {
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "company name: " + companyName + ", contact name: " + contactName + ", contact number: " + contactNumber + ", job title: " + jobTitle + ", job description: " + jobDescription;
    }
}

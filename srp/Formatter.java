package solid.live.srp;


public class Formatter {

    //other method related to customer
    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + empId + "'>" +
                "<span>" + name + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (totalLeaveAllowed - leaveTaken) + "</span>";
        str += "<span>" + Math.round(monthlySalary * 12) + "</span>";
        if (manager != null) str += "<span>" + manager + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}

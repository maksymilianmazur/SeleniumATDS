package Reply

class ValidationReply {
    private String referenceDocumentBusinessIdentificator;
    private String replyCode;
    private String expectedReplyCode;

    void assertReplyCode()
    {
        if (this.replyCode == this.expectedReplyCode)
        {
             log.info("Test passed: EOP-PT-PU-"+referenceDocumentBusinessIdentificator+"-AT")
        }
        else{
             log.error("Test failed: EOP-PT-PU-"+referenceDocumentBusinessIdentificator+"-AT")
        }

    }
    ValidationReply(String referenceDocumentBusinessIdentificator, String replyCode, String expectedReplyCode)
    {
        this.referenceDocumentBusinessIdentificator = referenceDocumentBusinessIdentificator
        this.replyCode = replyCode
        this.expectedReplyCode = expectedReplyCode
    }

}








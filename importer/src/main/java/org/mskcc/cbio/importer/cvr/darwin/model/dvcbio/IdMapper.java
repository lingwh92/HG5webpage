package org.mskcc.cbio.importer.cvr.darwin.model.dvcbio;

public class IdMapper {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.DEID_TO_SAMPLE_ID.DEIDENTIFICATION_ID
     *
     * @mbggenerated Fri Nov 21 11:57:17 EST 2014
     */
    private Integer DEIDENTIFICATION_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DVCBIO.DEID_TO_SAMPLE_ID.SAMPLE_ID
     *
     * @mbggenerated Fri Nov 21 11:57:17 EST 2014
     */
    private String SAMPLE_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.DEID_TO_SAMPLE_ID.DEIDENTIFICATION_ID
     *
     * @return the value of DVCBIO.DEID_TO_SAMPLE_ID.DEIDENTIFICATION_ID
     *
     * @mbggenerated Fri Nov 21 11:57:17 EST 2014
     */
    public Integer getDEIDENTIFICATION_ID() {
        return DEIDENTIFICATION_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.DEID_TO_SAMPLE_ID.DEIDENTIFICATION_ID
     *
     * @param DEIDENTIFICATION_ID the value for DVCBIO.DEID_TO_SAMPLE_ID.DEIDENTIFICATION_ID
     *
     * @mbggenerated Fri Nov 21 11:57:17 EST 2014
     */
    public void setDEIDENTIFICATION_ID(Integer DEIDENTIFICATION_ID) {
        this.DEIDENTIFICATION_ID = DEIDENTIFICATION_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DVCBIO.DEID_TO_SAMPLE_ID.SAMPLE_ID
     *
     * @return the value of DVCBIO.DEID_TO_SAMPLE_ID.SAMPLE_ID
     *
     * @mbggenerated Fri Nov 21 11:57:17 EST 2014
     */
    public String getSAMPLE_ID() {
        return SAMPLE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DVCBIO.DEID_TO_SAMPLE_ID.SAMPLE_ID
     *
     * @param SAMPLE_ID the value for DVCBIO.DEID_TO_SAMPLE_ID.SAMPLE_ID
     *
     * @mbggenerated Fri Nov 21 11:57:17 EST 2014
     */
    public void setSAMPLE_ID(String SAMPLE_ID) {
        this.SAMPLE_ID = SAMPLE_ID == null ? null : SAMPLE_ID.trim();
    }
}
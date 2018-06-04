package com.njxxx.domain;

/**
 * Created by 陈亚兰 on 2018/6/4.
 */
public class PlmProjectDO {
    private String onePlmCode;//一级项目编码
    private String onePlmName;//一级项目
    private String twoPlmCode;//二级项目编码
    private String twoPlmName;//二级项目
    private String process;//研发阶段-PJHASE
    private String responsiblePerson;//项目负责人 -PJCOORDINATOR
    private String projectStatus;//项目状态
    private String YLRegistrationType;// -制剂注册分类
    private String NEWYLRegistrationType;//新
    private String ZJRegistrationType;
    private String NEWZJRegistrationType;
    private String PJCoordinatorId;
    private String PJCoordinator;
    private String APILeader;
    private String APILeaderId;
    private String PreparationLeaderId;

    public String getOnePlmCode() {
        return onePlmCode;
    }

    public void setOnePlmCode(String onePlmCode) {
        this.onePlmCode = onePlmCode;
    }

    public String getOnePlmName() {
        return onePlmName;
    }

    public void setOnePlmName(String onePlmName) {
        this.onePlmName = onePlmName;
    }

    public String getTwoPlmCode() {
        return twoPlmCode;
    }

    public void setTwoPlmCode(String twoPlmCode) {
        this.twoPlmCode = twoPlmCode;
    }

    public String getTwoPlmName() {
        return twoPlmName;
    }

    public void setTwoPlmName(String twoPlmName) {
        this.twoPlmName = twoPlmName;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getYLRegistrationType() {
        return YLRegistrationType;
    }

    public void setYLRegistrationType(String YLRegistrationType) {
        this.YLRegistrationType = YLRegistrationType;
    }

    public String getNEWYLRegistrationType() {
        return NEWYLRegistrationType;
    }

    public void setNEWYLRegistrationType(String NEWYLRegistrationType) {
        this.NEWYLRegistrationType = NEWYLRegistrationType;
    }

    public String getZJRegistrationType() {
        return ZJRegistrationType;
    }

    public void setZJRegistrationType(String ZJRegistrationType) {
        this.ZJRegistrationType = ZJRegistrationType;
    }

    public String getNEWZJRegistrationType() {
        return NEWZJRegistrationType;
    }

    public void setNEWZJRegistrationType(String NEWZJRegistrationType) {
        this.NEWZJRegistrationType = NEWZJRegistrationType;
    }

    public String getPJCoordinatorId() {
        return PJCoordinatorId;
    }

    public void setPJCoordinatorId(String PJCoordinatorId) {
        this.PJCoordinatorId = PJCoordinatorId;
    }

    public String getPJCoordinator() {
        return PJCoordinator;
    }

    public void setPJCoordinator(String PJCoordinator) {
        this.PJCoordinator = PJCoordinator;
    }

    public String getAPILeader() {
        return APILeader;
    }

    public void setAPILeader(String APILeader) {
        this.APILeader = APILeader;
    }

    public String getAPILeaderId() {
        return APILeaderId;
    }

    public void setAPILeaderId(String APILeaderId) {
        this.APILeaderId = APILeaderId;
    }

    public String getPreparationLeaderId() {
        return PreparationLeaderId;
    }

    public void setPreparationLeaderId(String preparationLeaderId) {
        PreparationLeaderId = preparationLeaderId;
    }

    public String getPreparationLeader() {
        return PreparationLeader;
    }

    public void setPreparationLeader(String preparationLeader) {
        PreparationLeader = preparationLeader;
    }

    private String PreparationLeader;

}

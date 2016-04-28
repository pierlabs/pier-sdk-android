package br.com.conductor.pier.api.v1.model;

import br.com.conductor.pier.api.v1.model.ExtraInfo;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class AuthToken  {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("extraInfo")
  private ExtraInfo extraInfo = null;
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("owner")
  private String owner = null;
  public enum StatusEnum {
     ACTIVE,  REVOKE,  DELETED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public ExtraInfo getExtraInfo() {
    return extraInfo;
  }
  public void setExtraInfo(ExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthToken {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  extraInfo: ").append(extraInfo).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object User Token
 **/
@ApiModel(description = "Object User Token")
public class UserToken  {
  
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("enviaSMS")
  private Boolean enviaSMS = null;
  @SerializedName("idTemplateEmail")
  private Long idTemplateEmail = null;
  @SerializedName("idTemplateSMS")
  private Long idTemplateSMS = null;
  @SerializedName("nsu")
  private Long nsu = null;

  
  /**
   * Represents the CPF number of the user
   **/
  @ApiModelProperty(value = "Represents the CPF number of the user")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * The user email
   **/
  @ApiModelProperty(value = "The user email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * DDD of the cell phone
   **/
  @ApiModelProperty(value = "DDD of the cell phone")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Phone number
   **/
  @ApiModelProperty(value = "Phone number")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * The user date of birth
   **/
  @ApiModelProperty(value = "The user date of birth")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Indicates if SMS send is enable
   **/
  @ApiModelProperty(value = "Indicates if SMS send is enable")
  public Boolean getEnviaSMS() {
    return enviaSMS;
  }
  public void setEnviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
  }

  
  /**
   * The template id of the email
   **/
  @ApiModelProperty(value = "The template id of the email")
  public Long getIdTemplateEmail() {
    return idTemplateEmail;
  }
  public void setIdTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
  }

  
  /**
   * The template id of the SMS
   **/
  @ApiModelProperty(value = "The template id of the SMS")
  public Long getIdTemplateSMS() {
    return idTemplateSMS;
  }
  public void setIdTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
  }

  
  /**
   * Unique sequential number
   **/
  @ApiModelProperty(value = "Unique sequential number")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserToken {\n");
    
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  enviaSMS: ").append(enviaSMS).append("\n");
    sb.append("  idTemplateEmail: ").append(idTemplateEmail).append("\n");
    sb.append("  idTemplateSMS: ").append(idTemplateSMS).append("\n");
    sb.append("  nsu: ").append(nsu).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

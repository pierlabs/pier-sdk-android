package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Usu\u00E1rio Token
 **/
@ApiModel(description = "Objeto Usu\u00E1rio Token")
public class UsuarioToken  {
  
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
   * CPF do usu\u00E1rio
   **/
  @ApiModelProperty(value = "CPF do usu\u00E1rio")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Email do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Email do usu\u00E1rio")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * DDD do telefone do usu\u00E1rio
   **/
  @ApiModelProperty(value = "DDD do telefone do usu\u00E1rio")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone do usu\u00E1rio
   **/
  @ApiModelProperty(value = "N\u00FAmero do telefone do usu\u00E1rio")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Data de nascimento do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Data de nascimento do usu\u00E1rio")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Flag que indica se deve ser enviado SMS
   **/
  @ApiModelProperty(value = "Flag que indica se deve ser enviado SMS")
  public Boolean getEnviaSMS() {
    return enviaSMS;
  }
  public void setEnviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
  }

  
  /**
   * Id do template do email
   **/
  @ApiModelProperty(value = "Id do template do email")
  public Long getIdTemplateEmail() {
    return idTemplateEmail;
  }
  public void setIdTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
  }

  
  /**
   * Id do template de sms
   **/
  @ApiModelProperty(value = "Id do template de sms")
  public Long getIdTemplateSMS() {
    return idTemplateSMS;
  }
  public void setIdTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
  }

  
  /**
   * N\u00FAmero sequ\u00EAncial \u00FAnico para envio de sms
   **/
  @ApiModelProperty(value = "N\u00FAmero sequ\u00EAncial \u00FAnico para envio de sms")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioToken {\n");
    
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

package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{usuario_token_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{usuario_token_persistencia_descricao}}}")
public class UsuarioTokenPersistencia  {
  
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
   * {{{usuario_token_persistencia_cpf_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_cpf_descricao}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_token_persistencia_email_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_email_descricao}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_token_persistencia_ddd_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_ddd_descricao}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{usuario_token_persistencia_telefone_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_telefone_descricao}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{usuario_token_persistencia_data_nascimento_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_data_nascimento_descricao}}}")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{usuario_token_persistencia_envia_sms_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_envia_sms_descricao}}}")
  public Boolean getEnviaSMS() {
    return enviaSMS;
  }
  public void setEnviaSMS(Boolean enviaSMS) {
    this.enviaSMS = enviaSMS;
  }

  
  /**
   * {{{usuario_token_persistencia_id_template_email_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_id_template_email_descricao}}}")
  public Long getIdTemplateEmail() {
    return idTemplateEmail;
  }
  public void setIdTemplateEmail(Long idTemplateEmail) {
    this.idTemplateEmail = idTemplateEmail;
  }

  
  /**
   * {{{usuario_token_persistencia_id_template_sms_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_id_template_sms_descricao}}}")
  public Long getIdTemplateSMS() {
    return idTemplateSMS;
  }
  public void setIdTemplateSMS(Long idTemplateSMS) {
    this.idTemplateSMS = idTemplateSMS;
  }

  
  /**
   * {{{usuario_token_persistencia_nsu_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_persistencia_nsu_descricao}}}")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioTokenPersistencia {\n");
    
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



package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{referencia_comercial_aprovado_response_description}}}
 **/
@ApiModel(description = "{{{referencia_comercial_aprovado_response_description}}}")
public class ReferenciaComercialAprovadoResponse  {
  
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("nomeContrato")
  private String nomeContrato = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("email")
  private String email = null;

  
  /**
   * {{{referencia_comercial_aprovado_response_razao_social_value}}}
   **/
  @ApiModelProperty(value = "{{{referencia_comercial_aprovado_response_razao_social_value}}}")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{referencia_comercial_aprovado_response_nome_contrato_value}}}
   **/
  @ApiModelProperty(value = "{{{referencia_comercial_aprovado_response_nome_contrato_value}}}")
  public String getNomeContrato() {
    return nomeContrato;
  }
  public void setNomeContrato(String nomeContrato) {
    this.nomeContrato = nomeContrato;
  }

  
  /**
   * {{{referencia_comercial_aprovado_response_ddd_value}}}
   **/
  @ApiModelProperty(value = "{{{referencia_comercial_aprovado_response_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{referencia_comercial_aprovado_response_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{referencia_comercial_aprovado_response_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{referencia_comercial_aprovado_response_email_value}}}
   **/
  @ApiModelProperty(value = "{{{referencia_comercial_aprovado_response_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenciaComercialAprovadoResponse {\n");
    
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeContrato: ").append(nomeContrato).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

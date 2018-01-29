package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * RefenciaAprovadoPersist
 **/
@ApiModel(description = "RefenciaAprovadoPersist")
public class RefenciaComercialAprovadoPersist  {
  
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
   * Apresenta o nome completo da raz\u00C3\u00A3o social da refer\u00C3\u00AAncia comercial (nome empresarial)
   **/
  @ApiModelProperty(value = "Apresenta o nome completo da raz\u00C3\u00A3o social da refer\u00C3\u00AAncia comercial (nome empresarial)")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * Nome do respons\u00C3\u00A1vel pela refer\u00C3\u00AAncia comercial
   **/
  @ApiModelProperty(value = "Nome do respons\u00C3\u00A1vel pela refer\u00C3\u00AAncia comercial")
  public String getNomeContrato() {
    return nomeContrato;
  }
  public void setNomeContrato(String nomeContrato) {
    this.nomeContrato = nomeContrato;
  }

  
  /**
   * DDD do contato da refer\u00C3\u00AAncia comercial
   **/
  @ApiModelProperty(value = "DDD do contato da refer\u00C3\u00AAncia comercial")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00C3\u00BAmero de contato da refer\u00C3\u00AAncia comercial
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero de contato da refer\u00C3\u00AAncia comercial")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * E-mail de contato da refer\u00C3\u00AAncia comercial
   **/
  @ApiModelProperty(value = "E-mail de contato da refer\u00C3\u00AAncia comercial")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefenciaComercialAprovadoPersist {\n");
    
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeContrato: ").append(nomeContrato).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

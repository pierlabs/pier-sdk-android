package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{codigo_seguranca_s_m_s_request_description}}}
 **/
@ApiModel(description = "{{{codigo_seguranca_s_m_s_request_description}}}")
public class CodigoSegurancaSMSRequest  {
  
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("codigoSeguranca")
  private String codigoSeguranca = null;

  
  /**
   * {{{codigo_seguranca_s_m_s_request_ddd_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_s_m_s_request_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{codigo_seguranca_s_m_s_request_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_s_m_s_request_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{codigo_seguranca_s_m_s_request_codigo_seguranca_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_s_m_s_request_codigo_seguranca_value}}}")
  public String getCodigoSeguranca() {
    return codigoSeguranca;
  }
  public void setCodigoSeguranca(String codigoSeguranca) {
    this.codigoSeguranca = codigoSeguranca;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaSMSRequest {\n");
    
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  codigoSeguranca: ").append(codigoSeguranca).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

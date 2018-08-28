package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{codigo_seguranca_e_m_a_i_l_persist_description}}}
 **/
@ApiModel(description = "{{{codigo_seguranca_e_m_a_i_l_persist_description}}}")
public class CodigoSegurancaEMAILPersist  {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("codigoSeguranca")
  private String codigoSeguranca = null;

  
  /**
   * {{{codigo_seguranca_e_m_a_i_l_persist_email_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_e_m_a_i_l_persist_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{codigo_seguranca_e_m_a_i_l_persist_codigo_seguranca_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_e_m_a_i_l_persist_codigo_seguranca_value}}}")
  public String getCodigoSeguranca() {
    return codigoSeguranca;
  }
  public void setCodigoSeguranca(String codigoSeguranca) {
    this.codigoSeguranca = codigoSeguranca;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaEMAILPersist {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  codigoSeguranca: ").append(codigoSeguranca).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

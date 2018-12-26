package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{codigo_seguranca_s_m_s_persist_description}}}
 **/
@ApiModel(description = "{{{codigo_seguranca_s_m_s_persist_description}}}")
public class CodigoSegurancaSMSPersist  {
  
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;

  
  /**
   * {{{codigo_seguranca_s_m_s_persist_ddd_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_s_m_s_persist_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{codigo_seguranca_s_m_s_persist_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{codigo_seguranca_s_m_s_persist_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodigoSegurancaSMSPersist {\n");
    
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

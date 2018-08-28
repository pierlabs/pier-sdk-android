package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{telefone_adicional_persist_description}}}
 **/
@ApiModel(description = "{{{telefone_adicional_persist_description}}}")
public class TelefoneAdicionalPersist  {
  
  @SerializedName("idTipoTelefone")
  private Long idTipoTelefone = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;

  
  /**
   * {{{telefone_adicional_persist_id_tipo_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_adicional_persist_id_tipo_telefone_value}}}")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * {{{telefone_adicional_persist_ddd_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_adicional_persist_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_adicional_persist_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_adicional_persist_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_adicional_persist_ramal_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_adicional_persist_ramal_value}}}")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneAdicionalPersist {\n");
    
    sb.append("  idTipoTelefone: ").append(idTipoTelefone).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

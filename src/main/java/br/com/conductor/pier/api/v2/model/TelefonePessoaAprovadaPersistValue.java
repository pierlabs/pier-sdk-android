package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{telefone_pessoa_aprovada_persist_description}}}
 **/
@ApiModel(description = "{{{telefone_pessoa_aprovada_persist_description}}}")
public class TelefonePessoaAprovadaPersistValue  {
  
  @SerializedName("idTipoTelefone")
  private Long idTipoTelefone = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;

  
  /**
   * {{{telefone_pessoa_aprovada_persist_id_tipo_telefone_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{telefone_pessoa_aprovada_persist_id_tipo_telefone_value}}}")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_persist_ddd_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{telefone_pessoa_aprovada_persist_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_persist_telefone_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{telefone_pessoa_aprovada_persist_telefone_value}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{telefone_pessoa_aprovada_persist_ramal_value}}}
   **/
  @ApiModelProperty(value = "{{{telefone_pessoa_aprovada_persist_ramal_value}}}")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefonePessoaAprovadaPersistValue {\n");
    
    sb.append("  idTipoTelefone: ").append(idTipoTelefone).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

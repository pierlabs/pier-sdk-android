package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Telefone Pessoa Aprovada
 **/
@ApiModel(description = "Objeto Telefone Pessoa Aprovada")
public class TelefonePessoaAprovadaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTelefone")
  private Long idTipoTelefone = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Endere\u00E7o (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id).")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * C\u00F3digo DDD do telefone (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo DDD do telefone (id).")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone.
   **/
  @ApiModelProperty(value = "N\u00FAmero do telefone.")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * N\u00FAmero do ramal.
   **/
  @ApiModelProperty(value = "N\u00FAmero do ramal.")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefonePessoaAprovadaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoTelefone: ").append(idTipoTelefone).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

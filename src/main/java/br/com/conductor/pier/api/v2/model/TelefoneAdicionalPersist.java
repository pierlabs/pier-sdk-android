package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Telefone
 **/
@ApiModel(description = "Objeto Telefone")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Telefone (id)")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * DDD do n\u00FAmero do telefone
   **/
  @ApiModelProperty(value = "DDD do n\u00FAmero do telefone")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone
   **/
  @ApiModelProperty(value = "N\u00FAmero do telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * N\u00FAmero do ramal
   **/
  @ApiModelProperty(value = "N\u00FAmero do ramal")
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

package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Telefone do escritorio de cobran\u00E7a
 **/
@ApiModel(description = "Telefone do escritorio de cobran\u00E7a")
public class TelefoneEscritorioCobrancaDTO  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;

  
  /**
   * Identificador do telefone do escrit\u00F3rio de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Identificador do telefone do escrit\u00F3rio de cobran\u00E7a")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * DDD do telefone
   **/
  @ApiModelProperty(required = true, value = "DDD do telefone")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Ramal do telefone
   **/
  @ApiModelProperty(value = "Ramal do telefone")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneEscritorioCobrancaDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

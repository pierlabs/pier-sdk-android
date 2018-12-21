package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * telephone desktop billing description
 **/
@ApiModel(description = "telephone desktop billing description")
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
   * Telephone office charge id
   **/
  @ApiModelProperty(value = "Telephone office charge id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ddd phone billing desk
   **/
  @ApiModelProperty(required = true, value = "ddd phone billing desk")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * phone billing desk telephone
   **/
  @ApiModelProperty(required = true, value = "phone billing desk telephone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * telephone bill collection extension
   **/
  @ApiModelProperty(value = "telephone bill collection extension")
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

package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Telefone de escritorio para cobran\u00E7a
 **/
@ApiModel(description = "Telefone de escritorio para cobran\u00E7a")
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
   * Telefone escrit\u00F3rio cobranca id
   **/
  @ApiModelProperty(value = "Telefone escrit\u00F3rio cobranca id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Telefone escrit\u00F3rio cobranca ddd
   **/
  @ApiModelProperty(required = true, value = "Telefone escrit\u00F3rio cobranca ddd")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Telefone escrit\u00F3rio cobranca telefone
   **/
  @ApiModelProperty(required = true, value = "Telefone escrit\u00F3rio cobranca telefone")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Telefone escrit\u00F3rio cobranca ramal
   **/
  @ApiModelProperty(value = "Telefone escrit\u00F3rio cobranca ramal")
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

package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response representation of the campaign plan resource
 **/
@ApiModel(description = "Response representation of the campaign plan resource")
public class PlanoCampanhaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("parcelas")
  private Integer parcelas = null;
  @SerializedName("taxa")
  private BigDecimal taxa = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   * Identifier of the Campaign plan
   **/
  @ApiModelProperty(value = "Identifier of the Campaign plan")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Quantity of the parcels
   **/
  @ApiModelProperty(value = "Quantity of the parcels")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   * Interest taxes
   **/
  @ApiModelProperty(value = "Interest taxes")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  
  /**
   * Username
   **/
  @ApiModelProperty(value = "Username")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoCampanhaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  parcelas: ").append(parcelas).append("\n");
    sb.append("  taxa: ").append(taxa).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

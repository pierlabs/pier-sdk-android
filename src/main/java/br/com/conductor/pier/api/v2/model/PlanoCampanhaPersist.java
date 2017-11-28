package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * PlanoCampanha
 **/
@ApiModel(description = "PlanoCampanha")
public class PlanoCampanhaPersist  {
  
  @SerializedName("parcelas")
  private Integer parcelas = null;
  @SerializedName("taxa")
  private BigDecimal taxa = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoCampanhaPersist {\n");
    
    sb.append("  parcelas: ").append(parcelas).append("\n");
    sb.append("  taxa: ").append(taxa).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



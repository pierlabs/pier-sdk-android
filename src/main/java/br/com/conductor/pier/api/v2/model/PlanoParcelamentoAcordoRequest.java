package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de requisi\u00E7\u00E3o para simula\u00E7\u00E3o de um acordo
 **/
@ApiModel(description = "Objeto de requisi\u00E7\u00E3o para simula\u00E7\u00E3o de um acordo")
public class PlanoParcelamentoAcordoRequest  {
  
  @SerializedName("saldoDevedor")
  private BigDecimal saldoDevedor = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("diasAtraso")
  private Integer diasAtraso = null;

  
  /**
   * Saldo devedor
   **/
  @ApiModelProperty(required = true, value = "Saldo devedor")
  public BigDecimal getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   * N\u00FAmero de parcelas solicitadas para o acordo
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero de parcelas solicitadas para o acordo")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Dias de atraso da d\u00EDvida
   **/
  @ApiModelProperty(required = true, value = "Dias de atraso da d\u00EDvida")
  public Integer getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoAcordoRequest {\n");
    
    sb.append("  saldoDevedor: ").append(saldoDevedor).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  diasAtraso: ").append(diasAtraso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

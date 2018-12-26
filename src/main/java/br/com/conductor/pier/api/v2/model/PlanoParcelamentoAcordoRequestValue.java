package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{plano_parcelamento_acordo_request_description}}}
 **/
@ApiModel(description = "{{{plano_parcelamento_acordo_request_description}}}")
public class PlanoParcelamentoAcordoRequestValue  {
  
  @SerializedName("saldoDevedor")
  private BigDecimal saldoDevedor = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("diasAtraso")
  private Integer diasAtraso = null;

  
  /**
   * {{{plano_parcelamento_acordo_request_saldo_devedor_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{plano_parcelamento_acordo_request_saldo_devedor_value}}}")
  public BigDecimal getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   * {{{plano_parcelamento_acordo_request_numero_parcelas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{plano_parcelamento_acordo_request_numero_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{plano_parcelamento_acordo_request_dias_atraso_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{plano_parcelamento_acordo_request_dias_atraso_value}}}")
  public Integer getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoAcordoRequestValue {\n");
    
    sb.append("  saldoDevedor: ").append(saldoDevedor).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  diasAtraso: ").append(diasAtraso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

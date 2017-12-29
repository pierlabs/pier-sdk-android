package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ParcelamentoTransferenciaResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Parcelamento para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/
@ApiModel(description = "Parcelamento para Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
public class PlanoParcelamentoTransferenciaResponse  {
  
  @SerializedName("codigoEspecial")
  private Long codigoEspecial = null;
  @SerializedName("vencimentoPrimeiraParcela")
  private String vencimentoPrimeiraParcela = null;
  @SerializedName("flagJuros")
  private Integer flagJuros = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;
  @SerializedName("parcelas")
  private List<ParcelamentoTransferenciaResponse> parcelas = null;

  
  /**
   * C\u00C3\u00B3digo de processamento da transa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de processamento da transa\u00C3\u00A7\u00C3\u00A3o.")
  public Long getCodigoEspecial() {
    return codigoEspecial;
  }
  public void setCodigoEspecial(Long codigoEspecial) {
    this.codigoEspecial = codigoEspecial;
  }

  
  /**
   * Data de vencimento da primeira parcela.
   **/
  @ApiModelProperty(value = "Data de vencimento da primeira parcela.")
  public String getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * Flag indicativa para juros.
   **/
  @ApiModelProperty(value = "Flag indicativa para juros.")
  public Integer getFlagJuros() {
    return flagJuros;
  }
  public void setFlagJuros(Integer flagJuros) {
    this.flagJuros = flagJuros;
  }

  
  /**
   * N\u00C3\u00BAmero de meses para car\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero de meses para car\u00C3\u00AAncia.")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Lista com os planos de parcelamento.
   **/
  @ApiModelProperty(value = "Lista com os planos de parcelamento.")
  public List<ParcelamentoTransferenciaResponse> getParcelas() {
    return parcelas;
  }
  public void setParcelas(List<ParcelamentoTransferenciaResponse> parcelas) {
    this.parcelas = parcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaResponse {\n");
    
    sb.append("  codigoEspecial: ").append(codigoEspecial).append("\n");
    sb.append("  vencimentoPrimeiraParcela: ").append(vencimentoPrimeiraParcela).append("\n");
    sb.append("  flagJuros: ").append(flagJuros).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("  parcelas: ").append(parcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

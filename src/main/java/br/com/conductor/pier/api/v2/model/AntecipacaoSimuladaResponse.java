package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaDetalhesResponse;
import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada")
public class AntecipacaoSimuladaResponse  {
  
  @SerializedName("idAntecipacaoSimulada")
  private Long idAntecipacaoSimulada = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idEventoExterno")
  private Long idEventoExterno = null;
  @SerializedName("idTipoTransacao")
  private Long idTipoTransacao = null;
  @SerializedName("qtdeParcelasAntecipaveis")
  private Integer qtdeParcelasAntecipaveis = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("dataHoraSimulacao")
  private String dataHoraSimulacao = null;
  @SerializedName("taxaAntecipacaoAno")
  private BigDecimal taxaAntecipacaoAno = null;
  @SerializedName("detalhes")
  private List<AntecipacaoSimuladaDetalhesResponse> detalhes = null;

  
  /**
   * C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.")
  public Long getIdAntecipacaoSimulada() {
    return idAntecipacaoSimulada;
  }
  public void setIdAntecipacaoSimulada(Long idAntecipacaoSimulada) {
    this.idAntecipacaoSimulada = idAntecipacaoSimulada;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do evento.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do evento.")
  public Long getIdEventoExterno() {
    return idEventoExterno;
  }
  public void setIdEventoExterno(Long idEventoExterno) {
    this.idEventoExterno = idEventoExterno;
  }

  
  /**
   * C\u00C3\u00B3digo identificador do tipo do evento.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do tipo do evento.")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Quantidade de parcelas antecip\u00C3\u00A1veis.
   **/
  @ApiModelProperty(value = "Quantidade de parcelas antecip\u00C3\u00A1veis.")
  public Integer getQtdeParcelasAntecipaveis() {
    return qtdeParcelasAntecipaveis;
  }
  public void setQtdeParcelasAntecipaveis(Integer qtdeParcelasAntecipaveis) {
    this.qtdeParcelasAntecipaveis = qtdeParcelasAntecipaveis;
  }

  
  /**
   * Valor da parcela.
   **/
  @ApiModelProperty(value = "Valor da parcela.")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Data e hora em que a simula\u00C3\u00A7\u00C3\u00A3o foi feita.
   **/
  @ApiModelProperty(value = "Data e hora em que a simula\u00C3\u00A7\u00C3\u00A3o foi feita.")
  public String getDataHoraSimulacao() {
    return dataHoraSimulacao;
  }
  public void setDataHoraSimulacao(String dataHoraSimulacao) {
    this.dataHoraSimulacao = dataHoraSimulacao;
  }

  
  /**
   * Taxa de antecipa\u00C3\u00A7\u00C3\u00A3o aplicada (ao ano).
   **/
  @ApiModelProperty(value = "Taxa de antecipa\u00C3\u00A7\u00C3\u00A3o aplicada (ao ano).")
  public BigDecimal getTaxaAntecipacaoAno() {
    return taxaAntecipacaoAno;
  }
  public void setTaxaAntecipacaoAno(BigDecimal taxaAntecipacaoAno) {
    this.taxaAntecipacaoAno = taxaAntecipacaoAno;
  }

  
  /**
   * Detalhes da simula\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Detalhes da simula\u00C3\u00A7\u00C3\u00A3o.")
  public List<AntecipacaoSimuladaDetalhesResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<AntecipacaoSimuladaDetalhesResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaResponse {\n");
    
    sb.append("  idAntecipacaoSimulada: ").append(idAntecipacaoSimulada).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idEventoExterno: ").append(idEventoExterno).append("\n");
    sb.append("  idTipoTransacao: ").append(idTipoTransacao).append("\n");
    sb.append("  qtdeParcelasAntecipaveis: ").append(qtdeParcelasAntecipaveis).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  dataHoraSimulacao: ").append(dataHoraSimulacao).append("\n");
    sb.append("  taxaAntecipacaoAno: ").append(taxaAntecipacaoAno).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



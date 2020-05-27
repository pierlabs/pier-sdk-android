package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de requisi\u00E7\u00E3o para cria\u00E7\u00E3o de um novo evento externo de compras
 **/
@ApiModel(description = "Objeto de requisi\u00E7\u00E3o para cria\u00E7\u00E3o de um novo evento externo de compras")
public class EventoExternoCompraPersist  {
  
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorContrato")
  private BigDecimal valorContrato = null;
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("valorEncargosTotais")
  private BigDecimal valorEncargosTotais = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("carencia")
  private Integer carencia = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;

  
  /**
   * C\u00F3digo do estabelecimento
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo do estabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo da conta
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo do cart\u00E3o
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Data da compra
   **/
  @ApiModelProperty(required = true, value = "Data da compra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * C\u00F3digo do tipo de opera\u00E7\u00E3o
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo do tipo de opera\u00E7\u00E3o")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * N\u00FAmero de parcelas
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero de parcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor da parcela
   **/
  @ApiModelProperty(required = true, value = "Valor da parcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor contrato
   **/
  @ApiModelProperty(required = true, value = "Valor contrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Valor da compra
   **/
  @ApiModelProperty(required = true, value = "Valor da compra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor dos encargos totais
   **/
  @ApiModelProperty(required = true, value = "Valor dos encargos totais")
  public BigDecimal getValorEncargosTotais() {
    return valorEncargosTotais;
  }
  public void setValorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
  }

  
  /**
   * Valor da taxa de juros
   **/
  @ApiModelProperty(required = true, value = "Valor da taxa de juros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Valor IOF
   **/
  @ApiModelProperty(required = true, value = "Valor IOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor TAC
   **/
  @ApiModelProperty(required = true, value = "Valor TAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Origem do evento
   **/
  @ApiModelProperty(required = true, value = "Origem do evento")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Quantidade de meses de carencia
   **/
  @ApiModelProperty(value = "Quantidade de meses de carencia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Nome do estabelecimento
   **/
  @ApiModelProperty(value = "Nome do estabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventoExternoCompraPersist {\n");
    
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  valorEncargosTotais: ").append(valorEncargosTotais).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  carencia: ").append(carencia).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

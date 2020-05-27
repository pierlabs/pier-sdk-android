package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CdtTipoOperacao  {
  
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("codigoProcessamentoCancelamento")
  private String codigoProcessamentoCancelamento = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("excedentePermitido")
  private BigDecimal excedentePermitido = null;
  @SerializedName("flagCobraJuros")
  private Boolean flagCobraJuros = null;
  @SerializedName("flagCobraProRata")
  private Boolean flagCobraProRata = null;
  @SerializedName("flagCobraTarifa")
  private Boolean flagCobraTarifa = null;
  @SerializedName("flagCredito")
  private Boolean flagCredito = null;
  @SerializedName("flagCreditoContestavel")
  private Boolean flagCreditoContestavel = null;
  @SerializedName("flagIOFApartado")
  private Boolean flagIOFApartado = null;
  @SerializedName("flagManterTaxaJurosNoRotativo")
  private Boolean flagManterTaxaJurosNoRotativo = null;
  @SerializedName("flagPermitirParcelamento")
  private Boolean flagPermitirParcelamento = null;
  @SerializedName("flagPosProximoVencimento")
  private Integer flagPosProximoVencimento = null;
  @SerializedName("flagTiraTac")
  private Integer flagTiraTac = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEmissor")
  private Integer idEmissor = null;
  @SerializedName("idOperacaoOrigem")
  private Long idOperacaoOrigem = null;
  @SerializedName("idTabela")
  private Long idTabela = null;
  @SerializedName("idTabelaJuros")
  private Long idTabelaJuros = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("percentualTac")
  private BigDecimal percentualTac = null;
  @SerializedName("planoMaximo")
  private Integer planoMaximo = null;
  @SerializedName("planoMinimo")
  private Integer planoMinimo = null;
  @SerializedName("remuneracaoEmissor")
  private BigDecimal remuneracaoEmissor = null;
  @SerializedName("tarifa")
  private BigDecimal tarifa = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("tipoExcedentePermitido")
  private String tipoExcedentePermitido = null;
  @SerializedName("tipoOperacao")
  private String tipoOperacao = null;
  @SerializedName("valorMaximo")
  private BigDecimal valorMaximo = null;
  @SerializedName("valorMinimo")
  private BigDecimal valorMinimo = null;
  @SerializedName("valorOperacao")
  private BigDecimal valorOperacao = null;
  @SerializedName("valorParcela")
  private Long valorParcela = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoProcessamentoCancelamento() {
    return codigoProcessamentoCancelamento;
  }
  public void setCodigoProcessamentoCancelamento(String codigoProcessamentoCancelamento) {
    this.codigoProcessamentoCancelamento = codigoProcessamentoCancelamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Boolean flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagCobraProRata() {
    return flagCobraProRata;
  }
  public void setFlagCobraProRata(Boolean flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagCobraTarifa() {
    return flagCobraTarifa;
  }
  public void setFlagCobraTarifa(Boolean flagCobraTarifa) {
    this.flagCobraTarifa = flagCobraTarifa;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Boolean flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagCreditoContestavel() {
    return flagCreditoContestavel;
  }
  public void setFlagCreditoContestavel(Boolean flagCreditoContestavel) {
    this.flagCreditoContestavel = flagCreditoContestavel;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagIOFApartado() {
    return flagIOFApartado;
  }
  public void setFlagIOFApartado(Boolean flagIOFApartado) {
    this.flagIOFApartado = flagIOFApartado;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagPermitirParcelamento() {
    return flagPermitirParcelamento;
  }
  public void setFlagPermitirParcelamento(Boolean flagPermitirParcelamento) {
    this.flagPermitirParcelamento = flagPermitirParcelamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagPosProximoVencimento() {
    return flagPosProximoVencimento;
  }
  public void setFlagPosProximoVencimento(Integer flagPosProximoVencimento) {
    this.flagPosProximoVencimento = flagPosProximoVencimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagTiraTac() {
    return flagTiraTac;
  }
  public void setFlagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdOperacaoOrigem() {
    return idOperacaoOrigem;
  }
  public void setIdOperacaoOrigem(Long idOperacaoOrigem) {
    this.idOperacaoOrigem = idOperacaoOrigem;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdTabela() {
    return idTabela;
  }
  public void setIdTabela(Long idTabela) {
    this.idTabela = idTabela;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Long idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPercentualTac() {
    return percentualTac;
  }
  public void setPercentualTac(BigDecimal percentualTac) {
    this.percentualTac = percentualTac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getRemuneracaoEmissor() {
    return remuneracaoEmissor;
  }
  public void setRemuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTarifa() {
    return tarifa;
  }
  public void setTarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorOperacao() {
    return valorOperacao;
  }
  public void setValorOperacao(BigDecimal valorOperacao) {
    this.valorOperacao = valorOperacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(Long valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtTipoOperacao {\n");
    
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  codigoProcessamentoCancelamento: ").append(codigoProcessamentoCancelamento).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  excedentePermitido: ").append(excedentePermitido).append("\n");
    sb.append("  flagCobraJuros: ").append(flagCobraJuros).append("\n");
    sb.append("  flagCobraProRata: ").append(flagCobraProRata).append("\n");
    sb.append("  flagCobraTarifa: ").append(flagCobraTarifa).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  flagCreditoContestavel: ").append(flagCreditoContestavel).append("\n");
    sb.append("  flagIOFApartado: ").append(flagIOFApartado).append("\n");
    sb.append("  flagManterTaxaJurosNoRotativo: ").append(flagManterTaxaJurosNoRotativo).append("\n");
    sb.append("  flagPermitirParcelamento: ").append(flagPermitirParcelamento).append("\n");
    sb.append("  flagPosProximoVencimento: ").append(flagPosProximoVencimento).append("\n");
    sb.append("  flagTiraTac: ").append(flagTiraTac).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  idOperacaoOrigem: ").append(idOperacaoOrigem).append("\n");
    sb.append("  idTabela: ").append(idTabela).append("\n");
    sb.append("  idTabelaJuros: ").append(idTabelaJuros).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  percentualTac: ").append(percentualTac).append("\n");
    sb.append("  planoMaximo: ").append(planoMaximo).append("\n");
    sb.append("  planoMinimo: ").append(planoMinimo).append("\n");
    sb.append("  remuneracaoEmissor: ").append(remuneracaoEmissor).append("\n");
    sb.append("  tarifa: ").append(tarifa).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  tipoExcedentePermitido: ").append(tipoExcedentePermitido).append("\n");
    sb.append("  tipoOperacao: ").append(tipoOperacao).append("\n");
    sb.append("  valorMaximo: ").append(valorMaximo).append("\n");
    sb.append("  valorMinimo: ").append(valorMinimo).append("\n");
    sb.append("  valorOperacao: ").append(valorOperacao).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

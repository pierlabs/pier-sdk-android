package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.CdtAutorizacao;
import br.com.conductor.pier.api.v2.model.CdtTipoOperacao;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CdtEventoExternoCompra  {
  
  @SerializedName("acquireReferenceNumber")
  private String acquireReferenceNumber = null;
  @SerializedName("autorizacao")
  private CdtAutorizacao autorizacao = null;
  @SerializedName("carencia")
  private Integer carencia = null;
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("dataEntradaCompra")
  private String dataEntradaCompra = null;
  @SerializedName("dataFinanciamento")
  private String dataFinanciamento = null;
  @SerializedName("dataMovimento")
  private String dataMovimento = null;
  @SerializedName("dataVencimentoCompraFinal")
  private String dataVencimentoCompraFinal = null;
  @SerializedName("dataVencimentoCompraInicial")
  private String dataVencimentoCompraInicial = null;
  @SerializedName("dataVencimentoPadrao")
  private String dataVencimentoPadrao = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("dvnumeroEstabelecimento")
  private Integer dvnumeroEstabelecimento = null;
  @SerializedName("fatorBancoAjustado")
  private BigDecimal fatorBancoAjustado = null;
  @SerializedName("fatorComissaoGarantia")
  private BigDecimal fatorComissaoGarantia = null;
  @SerializedName("fatorTaxaAdministracao")
  private BigDecimal fatorTaxaAdministracao = null;
  @SerializedName("fatorTotal")
  private BigDecimal fatorTotal = null;
  @SerializedName("fatorTotalAjustado")
  private BigDecimal fatorTotalAjustado = null;
  @SerializedName("flagRefinanciamento")
  private Boolean flagRefinanciamento = null;
  @SerializedName("flagSelecionado")
  private Boolean flagSelecionado = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idContaPortador")
  private Long idContaPortador = null;
  @SerializedName("idCredor")
  private Long idCredor = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idEstabelecimentoExterno")
  private Long idEstabelecimentoExterno = null;
  @SerializedName("idEstabelecimentoVISA")
  private Long idEstabelecimentoVISA = null;
  @SerializedName("idIncoming")
  private Long idIncoming = null;
  @SerializedName("idMovimento")
  private Long idMovimento = null;
  @SerializedName("idOrigem")
  private Long idOrigem = null;
  @SerializedName("idRemessa")
  private Long idRemessa = null;
  @SerializedName("lote")
  private Integer lote = null;
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("nomeEstabelecimentoVISA")
  private String nomeEstabelecimentoVISA = null;
  @SerializedName("numeroContrato")
  private String numeroContrato = null;
  @SerializedName("numeroEstabelecimento")
  private Integer numeroEstabelecimento = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("operacao")
  private CdtTipoOperacao operacao = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("origemResolucao")
  private String origemResolucao = null;
  @SerializedName("quantidadeMoeda")
  private BigDecimal quantidadeMoeda = null;
  @SerializedName("status")
  private Long status = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("tipoCalculoPrestacao")
  private Integer tipoCalculoPrestacao = null;
  @SerializedName("tipoCompra")
  private Integer tipoCompra = null;
  @SerializedName("tipoEntrada")
  private String tipoEntrada = null;
  @SerializedName("tipoLiquidacao")
  private Integer tipoLiquidacao = null;
  @SerializedName("tipoPagamento")
  private Integer tipoPagamento = null;
  @SerializedName("valorAgenciamento")
  private BigDecimal valorAgenciamento = null;
  @SerializedName("valorComissao")
  private BigDecimal valorComissao = null;
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("valorContrato")
  private BigDecimal valorContrato = null;
  @SerializedName("valorEncargosBancarios")
  private BigDecimal valorEncargosBancarios = null;
  @SerializedName("valorEncargosTotais")
  private BigDecimal valorEncargosTotais = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorGarantias")
  private BigDecimal valorGarantias = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorLiquido")
  private BigDecimal valorLiquido = null;
  @SerializedName("valorOrigem")
  private BigDecimal valorOrigem = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getAcquireReferenceNumber() {
    return acquireReferenceNumber;
  }
  public void setAcquireReferenceNumber(String acquireReferenceNumber) {
    this.acquireReferenceNumber = acquireReferenceNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public CdtAutorizacao getAutorizacao() {
    return autorizacao;
  }
  public void setAutorizacao(CdtAutorizacao autorizacao) {
    this.autorizacao = autorizacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataEntradaCompra() {
    return dataEntradaCompra;
  }
  public void setDataEntradaCompra(String dataEntradaCompra) {
    this.dataEntradaCompra = dataEntradaCompra;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataFinanciamento() {
    return dataFinanciamento;
  }
  public void setDataFinanciamento(String dataFinanciamento) {
    this.dataFinanciamento = dataFinanciamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataVencimentoCompraFinal() {
    return dataVencimentoCompraFinal;
  }
  public void setDataVencimentoCompraFinal(String dataVencimentoCompraFinal) {
    this.dataVencimentoCompraFinal = dataVencimentoCompraFinal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataVencimentoCompraInicial() {
    return dataVencimentoCompraInicial;
  }
  public void setDataVencimentoCompraInicial(String dataVencimentoCompraInicial) {
    this.dataVencimentoCompraInicial = dataVencimentoCompraInicial;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
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
  public Integer getDvnumeroEstabelecimento() {
    return dvnumeroEstabelecimento;
  }
  public void setDvnumeroEstabelecimento(Integer dvnumeroEstabelecimento) {
    this.dvnumeroEstabelecimento = dvnumeroEstabelecimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFatorBancoAjustado() {
    return fatorBancoAjustado;
  }
  public void setFatorBancoAjustado(BigDecimal fatorBancoAjustado) {
    this.fatorBancoAjustado = fatorBancoAjustado;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFatorComissaoGarantia() {
    return fatorComissaoGarantia;
  }
  public void setFatorComissaoGarantia(BigDecimal fatorComissaoGarantia) {
    this.fatorComissaoGarantia = fatorComissaoGarantia;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFatorTaxaAdministracao() {
    return fatorTaxaAdministracao;
  }
  public void setFatorTaxaAdministracao(BigDecimal fatorTaxaAdministracao) {
    this.fatorTaxaAdministracao = fatorTaxaAdministracao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFatorTotal() {
    return fatorTotal;
  }
  public void setFatorTotal(BigDecimal fatorTotal) {
    this.fatorTotal = fatorTotal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getFatorTotalAjustado() {
    return fatorTotalAjustado;
  }
  public void setFatorTotalAjustado(BigDecimal fatorTotalAjustado) {
    this.fatorTotalAjustado = fatorTotalAjustado;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagRefinanciamento() {
    return flagRefinanciamento;
  }
  public void setFlagRefinanciamento(Boolean flagRefinanciamento) {
    this.flagRefinanciamento = flagRefinanciamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagSelecionado() {
    return flagSelecionado;
  }
  public void setFlagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
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
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdCredor() {
    return idCredor;
  }
  public void setIdCredor(Long idCredor) {
    this.idCredor = idCredor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdEstabelecimentoExterno() {
    return idEstabelecimentoExterno;
  }
  public void setIdEstabelecimentoExterno(Long idEstabelecimentoExterno) {
    this.idEstabelecimentoExterno = idEstabelecimentoExterno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdEstabelecimentoVISA() {
    return idEstabelecimentoVISA;
  }
  public void setIdEstabelecimentoVISA(Long idEstabelecimentoVISA) {
    this.idEstabelecimentoVISA = idEstabelecimentoVISA;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdIncoming() {
    return idIncoming;
  }
  public void setIdIncoming(Long idIncoming) {
    this.idIncoming = idIncoming;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdMovimento() {
    return idMovimento;
  }
  public void setIdMovimento(Long idMovimento) {
    this.idMovimento = idMovimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdOrigem() {
    return idOrigem;
  }
  public void setIdOrigem(Long idOrigem) {
    this.idOrigem = idOrigem;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdRemessa() {
    return idRemessa;
  }
  public void setIdRemessa(Long idRemessa) {
    this.idRemessa = idRemessa;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLote() {
    return lote;
  }
  public void setLote(Integer lote) {
    this.lote = lote;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeEstabelecimentoVISA() {
    return nomeEstabelecimentoVISA;
  }
  public void setNomeEstabelecimentoVISA(String nomeEstabelecimentoVISA) {
    this.nomeEstabelecimentoVISA = nomeEstabelecimentoVISA;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroContrato() {
    return numeroContrato;
  }
  public void setNumeroContrato(String numeroContrato) {
    this.numeroContrato = numeroContrato;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Integer numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public CdtTipoOperacao getOperacao() {
    return operacao;
  }
  public void setOperacao(CdtTipoOperacao operacao) {
    this.operacao = operacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrigemResolucao() {
    return origemResolucao;
  }
  public void setOrigemResolucao(String origemResolucao) {
    this.origemResolucao = origemResolucao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getQuantidadeMoeda() {
    return quantidadeMoeda;
  }
  public void setQuantidadeMoeda(BigDecimal quantidadeMoeda) {
    this.quantidadeMoeda = quantidadeMoeda;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
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
  public Integer getTipoCalculoPrestacao() {
    return tipoCalculoPrestacao;
  }
  public void setTipoCalculoPrestacao(Integer tipoCalculoPrestacao) {
    this.tipoCalculoPrestacao = tipoCalculoPrestacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTipoCompra() {
    return tipoCompra;
  }
  public void setTipoCompra(Integer tipoCompra) {
    this.tipoCompra = tipoCompra;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTipoEntrada() {
    return tipoEntrada;
  }
  public void setTipoEntrada(String tipoEntrada) {
    this.tipoEntrada = tipoEntrada;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTipoLiquidacao() {
    return tipoLiquidacao;
  }
  public void setTipoLiquidacao(Integer tipoLiquidacao) {
    this.tipoLiquidacao = tipoLiquidacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(Integer tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorAgenciamento() {
    return valorAgenciamento;
  }
  public void setValorAgenciamento(BigDecimal valorAgenciamento) {
    this.valorAgenciamento = valorAgenciamento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorComissao() {
    return valorComissao;
  }
  public void setValorComissao(BigDecimal valorComissao) {
    this.valorComissao = valorComissao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorEncargosBancarios() {
    return valorEncargosBancarios;
  }
  public void setValorEncargosBancarios(BigDecimal valorEncargosBancarios) {
    this.valorEncargosBancarios = valorEncargosBancarios;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorEncargosTotais() {
    return valorEncargosTotais;
  }
  public void setValorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorGarantias() {
    return valorGarantias;
  }
  public void setValorGarantias(BigDecimal valorGarantias) {
    this.valorGarantias = valorGarantias;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorOrigem() {
    return valorOrigem;
  }
  public void setValorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
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
    sb.append("class CdtEventoExternoCompra {\n");
    
    sb.append("  acquireReferenceNumber: ").append(acquireReferenceNumber).append("\n");
    sb.append("  autorizacao: ").append(autorizacao).append("\n");
    sb.append("  carencia: ").append(carencia).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  dataEntradaCompra: ").append(dataEntradaCompra).append("\n");
    sb.append("  dataFinanciamento: ").append(dataFinanciamento).append("\n");
    sb.append("  dataMovimento: ").append(dataMovimento).append("\n");
    sb.append("  dataVencimentoCompraFinal: ").append(dataVencimentoCompraFinal).append("\n");
    sb.append("  dataVencimentoCompraInicial: ").append(dataVencimentoCompraInicial).append("\n");
    sb.append("  dataVencimentoPadrao: ").append(dataVencimentoPadrao).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  dvnumeroEstabelecimento: ").append(dvnumeroEstabelecimento).append("\n");
    sb.append("  fatorBancoAjustado: ").append(fatorBancoAjustado).append("\n");
    sb.append("  fatorComissaoGarantia: ").append(fatorComissaoGarantia).append("\n");
    sb.append("  fatorTaxaAdministracao: ").append(fatorTaxaAdministracao).append("\n");
    sb.append("  fatorTotal: ").append(fatorTotal).append("\n");
    sb.append("  fatorTotalAjustado: ").append(fatorTotalAjustado).append("\n");
    sb.append("  flagRefinanciamento: ").append(flagRefinanciamento).append("\n");
    sb.append("  flagSelecionado: ").append(flagSelecionado).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idContaPortador: ").append(idContaPortador).append("\n");
    sb.append("  idCredor: ").append(idCredor).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idEstabelecimentoExterno: ").append(idEstabelecimentoExterno).append("\n");
    sb.append("  idEstabelecimentoVISA: ").append(idEstabelecimentoVISA).append("\n");
    sb.append("  idIncoming: ").append(idIncoming).append("\n");
    sb.append("  idMovimento: ").append(idMovimento).append("\n");
    sb.append("  idOrigem: ").append(idOrigem).append("\n");
    sb.append("  idRemessa: ").append(idRemessa).append("\n");
    sb.append("  lote: ").append(lote).append("\n");
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  nomeEstabelecimentoVISA: ").append(nomeEstabelecimentoVISA).append("\n");
    sb.append("  numeroContrato: ").append(numeroContrato).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  operacao: ").append(operacao).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  origemResolucao: ").append(origemResolucao).append("\n");
    sb.append("  quantidadeMoeda: ").append(quantidadeMoeda).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  tipoCalculoPrestacao: ").append(tipoCalculoPrestacao).append("\n");
    sb.append("  tipoCompra: ").append(tipoCompra).append("\n");
    sb.append("  tipoEntrada: ").append(tipoEntrada).append("\n");
    sb.append("  tipoLiquidacao: ").append(tipoLiquidacao).append("\n");
    sb.append("  tipoPagamento: ").append(tipoPagamento).append("\n");
    sb.append("  valorAgenciamento: ").append(valorAgenciamento).append("\n");
    sb.append("  valorComissao: ").append(valorComissao).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  valorEncargosBancarios: ").append(valorEncargosBancarios).append("\n");
    sb.append("  valorEncargosTotais: ").append(valorEncargosTotais).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorGarantias: ").append(valorGarantias).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorLiquido: ").append(valorLiquido).append("\n");
    sb.append("  valorOrigem: ").append(valorOrigem).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

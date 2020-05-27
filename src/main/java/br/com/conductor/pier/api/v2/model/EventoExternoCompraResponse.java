package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AutorizacaoResponse;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de retorno de um evento externo de compras n\u00E3o processadas
 **/
@ApiModel(description = "Objeto de retorno de um evento externo de compras n\u00E3o processadas")
public class EventoExternoCompraResponse  {
  
  @SerializedName("dvnumeroEstabelecimento")
  private Integer dvnumeroEstabelecimento = null;
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("tipoEntrada")
  private String tipoEntrada = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("status")
  private Long status = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("valorContrato")
  private BigDecimal valorContrato = null;
  @SerializedName("valorEncargosTotais")
  private BigDecimal valorEncargosTotais = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("dataEntradaCompra")
  private String dataEntradaCompra = null;
  @SerializedName("dataVencimentoPadrao")
  private String dataVencimentoPadrao = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("carencia")
  private Integer carencia = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("valorOrigem")
  private BigDecimal valorOrigem = null;
  @SerializedName("idIncoming")
  private Long idIncoming = null;
  @SerializedName("idEstabelecimentoVISA")
  private Long idEstabelecimentoVISA = null;
  @SerializedName("nomeEstabelecimentoVISA")
  private String nomeEstabelecimentoVISA = null;
  @SerializedName("idEstabelecimentoExterno")
  private Long idEstabelecimentoExterno = null;
  @SerializedName("idAutorizacao")
  private Long idAutorizacao = null;
  @SerializedName("idMovimento")
  private Long idMovimento = null;
  @SerializedName("idRemessa")
  private Long idRemessa = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("numeroContrato")
  private String numeroContrato = null;
  @SerializedName("idContaPortador")
  private Long idContaPortador = null;
  @SerializedName("dataMovimento")
  private String dataMovimento = null;
  @SerializedName("lote")
  private Integer lote = null;
  @SerializedName("numeroEstabelecimento")
  private Integer numeroEstabelecimento = null;
  @SerializedName("quantidadeMoeda")
  private BigDecimal quantidadeMoeda = null;
  @SerializedName("fatorTotalAjustado")
  private BigDecimal fatorTotalAjustado = null;
  @SerializedName("fatorBancoAjustado")
  private BigDecimal fatorBancoAjustado = null;
  @SerializedName("fatorTaxaAdministracao")
  private BigDecimal fatorTaxaAdministracao = null;
  @SerializedName("fatorComissaoGarantia")
  private BigDecimal fatorComissaoGarantia = null;
  @SerializedName("fatorTotal")
  private BigDecimal fatorTotal = null;
  @SerializedName("dataFinanciamento")
  private String dataFinanciamento = null;
  @SerializedName("dataVencimentoCompraInicial")
  private String dataVencimentoCompraInicial = null;
  @SerializedName("dataVencimentoCompraFinal")
  private String dataVencimentoCompraFinal = null;
  @SerializedName("flagSelecionado")
  private Boolean flagSelecionado = null;
  @SerializedName("flagRefinanciamento")
  private Boolean flagRefinanciamento = null;
  @SerializedName("tipoCompra")
  private Integer tipoCompra = null;
  @SerializedName("tipoPagamento")
  private Integer tipoPagamento = null;
  @SerializedName("tipoCalculoPrestacao")
  private Integer tipoCalculoPrestacao = null;
  @SerializedName("tipoLiquidacao")
  private Integer tipoLiquidacao = null;
  @SerializedName("idCredor")
  private Long idCredor = null;
  @SerializedName("valorComissao")
  private BigDecimal valorComissao = null;
  @SerializedName("valorLiquido")
  private BigDecimal valorLiquido = null;
  @SerializedName("valorEncargosBancarios")
  private BigDecimal valorEncargosBancarios = null;
  @SerializedName("valorGarantias")
  private BigDecimal valorGarantias = null;
  @SerializedName("valorAgenciamento")
  private BigDecimal valorAgenciamento = null;
  @SerializedName("origemResolucao")
  private String origemResolucao = null;
  @SerializedName("idOrigem")
  private Long idOrigem = null;
  @SerializedName("acquireReferenceNumber")
  private String acquireReferenceNumber = null;
  @SerializedName("autorizacao")
  private AutorizacaoResponse autorizacao = null;

  
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
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
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
   * C\u00F3digo do evento
   **/
  @ApiModelProperty(value = "C\u00F3digo do evento")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo do estabelecimento
   **/
  @ApiModelProperty(value = "C\u00F3digo do estabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo do cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Status do evento
   **/
  @ApiModelProperty(value = "Status do evento")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   * N\u00FAmero de parcelas
   **/
  @ApiModelProperty(value = "N\u00FAmero de parcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor da parcela
   **/
  @ApiModelProperty(value = "Valor da parcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor da primeira parcela
   **/
  @ApiModelProperty(value = "Valor da primeira parcela")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da compra
   **/
  @ApiModelProperty(value = "Valor da compra")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor do contrato
   **/
  @ApiModelProperty(value = "Valor do contrato")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Valor dos encargos totais
   **/
  @ApiModelProperty(value = "Valor dos encargos totais")
  public BigDecimal getValorEncargosTotais() {
    return valorEncargosTotais;
  }
  public void setValorEncargosTotais(BigDecimal valorEncargosTotais) {
    this.valorEncargosTotais = valorEncargosTotais;
  }

  
  /**
   * Data da compra
   **/
  @ApiModelProperty(value = "Data da compra")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * C\u00F3digo do tipo de opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo do tipo de opera\u00E7\u00E3o")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Valor da taxa de juros
   **/
  @ApiModelProperty(value = "Valor da taxa de juros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Valor IOF
   **/
  @ApiModelProperty(value = "Valor IOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor TAC
   **/
  @ApiModelProperty(value = "Valor TAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Origem do evento
   **/
  @ApiModelProperty(value = "Origem do evento")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Data de entrada do evento
   **/
  @ApiModelProperty(value = "Data de entrada do evento")
  public String getDataEntradaCompra() {
    return dataEntradaCompra;
  }
  public void setDataEntradaCompra(String dataEntradaCompra) {
    this.dataEntradaCompra = dataEntradaCompra;
  }

  
  /**
   * Data de vencimento padr\u00E3o
   **/
  @ApiModelProperty(value = "Data de vencimento padr\u00E3o")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Data de vencimento real
   **/
  @ApiModelProperty(value = "Data de vencimento real")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Car\u00EAncia
   **/
  @ApiModelProperty(value = "Car\u00EAncia")
  public Integer getCarencia() {
    return carencia;
  }
  public void setCarencia(Integer carencia) {
    this.carencia = carencia;
  }

  
  /**
   * Descri\u00E7\u00E3o do evento
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do evento")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o
   **/
  @ApiModelProperty(value = "N\u00FAmero do cart\u00E3o")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * Valor de origem
   **/
  @ApiModelProperty(value = "Valor de origem")
  public BigDecimal getValorOrigem() {
    return valorOrigem;
  }
  public void setValorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
  }

  
  /**
   * C\u00F3digo de entrada
   **/
  @ApiModelProperty(value = "C\u00F3digo de entrada")
  public Long getIdIncoming() {
    return idIncoming;
  }
  public void setIdIncoming(Long idIncoming) {
    this.idIncoming = idIncoming;
  }

  
  /**
   * C\u00F3digo do estabelecimento VISA
   **/
  @ApiModelProperty(value = "C\u00F3digo do estabelecimento VISA")
  public Long getIdEstabelecimentoVISA() {
    return idEstabelecimentoVISA;
  }
  public void setIdEstabelecimentoVISA(Long idEstabelecimentoVISA) {
    this.idEstabelecimentoVISA = idEstabelecimentoVISA;
  }

  
  /**
   * Nome do estabelecimento VISA
   **/
  @ApiModelProperty(value = "Nome do estabelecimento VISA")
  public String getNomeEstabelecimentoVISA() {
    return nomeEstabelecimentoVISA;
  }
  public void setNomeEstabelecimentoVISA(String nomeEstabelecimentoVISA) {
    this.nomeEstabelecimentoVISA = nomeEstabelecimentoVISA;
  }

  
  /**
   * C\u00F3digo do estabelecimento externo
   **/
  @ApiModelProperty(value = "C\u00F3digo do estabelecimento externo")
  public Long getIdEstabelecimentoExterno() {
    return idEstabelecimentoExterno;
  }
  public void setIdEstabelecimentoExterno(Long idEstabelecimentoExterno) {
    this.idEstabelecimentoExterno = idEstabelecimentoExterno;
  }

  
  /**
   * Identificador de autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identificador de autoriza\u00E7\u00E3o")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * C\u00F3digo de movimento
   **/
  @ApiModelProperty(value = "C\u00F3digo de movimento")
  public Long getIdMovimento() {
    return idMovimento;
  }
  public void setIdMovimento(Long idMovimento) {
    this.idMovimento = idMovimento;
  }

  
  /**
   * C\u00F3digo de remessa
   **/
  @ApiModelProperty(value = "C\u00F3digo de remessa")
  public Long getIdRemessa() {
    return idRemessa;
  }
  public void setIdRemessa(Long idRemessa) {
    this.idRemessa = idRemessa;
  }

  
  /**
   * C\u00F3digo de autorizac\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de autorizac\u00E3o")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * N\u00FAmero do contrato
   **/
  @ApiModelProperty(value = "N\u00FAmero do contrato")
  public String getNumeroContrato() {
    return numeroContrato;
  }
  public void setNumeroContrato(String numeroContrato) {
    this.numeroContrato = numeroContrato;
  }

  
  /**
   * C\u00F3digo da conta do portador
   **/
  @ApiModelProperty(value = "C\u00F3digo da conta do portador")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   * Data de movimento
   **/
  @ApiModelProperty(value = "Data de movimento")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * N\u00FAmero do lote
   **/
  @ApiModelProperty(value = "N\u00FAmero do lote")
  public Integer getLote() {
    return lote;
  }
  public void setLote(Integer lote) {
    this.lote = lote;
  }

  
  /**
   * N\u00FAmero do estabelecimento
   **/
  @ApiModelProperty(value = "N\u00FAmero do estabelecimento")
  public Integer getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Integer numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Quantidade de moeda
   **/
  @ApiModelProperty(value = "Quantidade de moeda")
  public BigDecimal getQuantidadeMoeda() {
    return quantidadeMoeda;
  }
  public void setQuantidadeMoeda(BigDecimal quantidadeMoeda) {
    this.quantidadeMoeda = quantidadeMoeda;
  }

  
  /**
   * Fator total ajustado
   **/
  @ApiModelProperty(value = "Fator total ajustado")
  public BigDecimal getFatorTotalAjustado() {
    return fatorTotalAjustado;
  }
  public void setFatorTotalAjustado(BigDecimal fatorTotalAjustado) {
    this.fatorTotalAjustado = fatorTotalAjustado;
  }

  
  /**
   * Fator de banco ajustado
   **/
  @ApiModelProperty(value = "Fator de banco ajustado")
  public BigDecimal getFatorBancoAjustado() {
    return fatorBancoAjustado;
  }
  public void setFatorBancoAjustado(BigDecimal fatorBancoAjustado) {
    this.fatorBancoAjustado = fatorBancoAjustado;
  }

  
  /**
   * Fator da taxa de administra\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Fator da taxa de administra\u00E7\u00E3o")
  public BigDecimal getFatorTaxaAdministracao() {
    return fatorTaxaAdministracao;
  }
  public void setFatorTaxaAdministracao(BigDecimal fatorTaxaAdministracao) {
    this.fatorTaxaAdministracao = fatorTaxaAdministracao;
  }

  
  /**
   * Fator da comiss\u00E3o de garantia
   **/
  @ApiModelProperty(value = "Fator da comiss\u00E3o de garantia")
  public BigDecimal getFatorComissaoGarantia() {
    return fatorComissaoGarantia;
  }
  public void setFatorComissaoGarantia(BigDecimal fatorComissaoGarantia) {
    this.fatorComissaoGarantia = fatorComissaoGarantia;
  }

  
  /**
   * Fator total
   **/
  @ApiModelProperty(value = "Fator total")
  public BigDecimal getFatorTotal() {
    return fatorTotal;
  }
  public void setFatorTotal(BigDecimal fatorTotal) {
    this.fatorTotal = fatorTotal;
  }

  
  /**
   * Data de financiamento
   **/
  @ApiModelProperty(value = "Data de financiamento")
  public String getDataFinanciamento() {
    return dataFinanciamento;
  }
  public void setDataFinanciamento(String dataFinanciamento) {
    this.dataFinanciamento = dataFinanciamento;
  }

  
  /**
   * Data de vencimento de compra inicial
   **/
  @ApiModelProperty(value = "Data de vencimento de compra inicial")
  public String getDataVencimentoCompraInicial() {
    return dataVencimentoCompraInicial;
  }
  public void setDataVencimentoCompraInicial(String dataVencimentoCompraInicial) {
    this.dataVencimentoCompraInicial = dataVencimentoCompraInicial;
  }

  
  /**
   * Data de vencimento de compra final
   **/
  @ApiModelProperty(value = "Data de vencimento de compra final")
  public String getDataVencimentoCompraFinal() {
    return dataVencimentoCompraFinal;
  }
  public void setDataVencimentoCompraFinal(String dataVencimentoCompraFinal) {
    this.dataVencimentoCompraFinal = dataVencimentoCompraFinal;
  }

  
  /**
   * Flag de sele\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Flag de sele\u00E7\u00E3o")
  public Boolean getFlagSelecionado() {
    return flagSelecionado;
  }
  public void setFlagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
  }

  
  /**
   * Flag de refinanciamento
   **/
  @ApiModelProperty(value = "Flag de refinanciamento")
  public Boolean getFlagRefinanciamento() {
    return flagRefinanciamento;
  }
  public void setFlagRefinanciamento(Boolean flagRefinanciamento) {
    this.flagRefinanciamento = flagRefinanciamento;
  }

  
  /**
   * Tipo de compra
   **/
  @ApiModelProperty(value = "Tipo de compra")
  public Integer getTipoCompra() {
    return tipoCompra;
  }
  public void setTipoCompra(Integer tipoCompra) {
    this.tipoCompra = tipoCompra;
  }

  
  /**
   * Tipo de pagamento
   **/
  @ApiModelProperty(value = "Tipo de pagamento")
  public Integer getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(Integer tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * Tipo de c\u00E1lculo de presta\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Tipo de c\u00E1lculo de presta\u00E7\u00E3o")
  public Integer getTipoCalculoPrestacao() {
    return tipoCalculoPrestacao;
  }
  public void setTipoCalculoPrestacao(Integer tipoCalculoPrestacao) {
    this.tipoCalculoPrestacao = tipoCalculoPrestacao;
  }

  
  /**
   * Tipo de liquida\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Tipo de liquida\u00E7\u00E3o")
  public Integer getTipoLiquidacao() {
    return tipoLiquidacao;
  }
  public void setTipoLiquidacao(Integer tipoLiquidacao) {
    this.tipoLiquidacao = tipoLiquidacao;
  }

  
  /**
   * C\u00F3digo do credor
   **/
  @ApiModelProperty(value = "C\u00F3digo do credor")
  public Long getIdCredor() {
    return idCredor;
  }
  public void setIdCredor(Long idCredor) {
    this.idCredor = idCredor;
  }

  
  /**
   * Valor da comiss\u00E3o
   **/
  @ApiModelProperty(value = "Valor da comiss\u00E3o")
  public BigDecimal getValorComissao() {
    return valorComissao;
  }
  public void setValorComissao(BigDecimal valorComissao) {
    this.valorComissao = valorComissao;
  }

  
  /**
   * Valor l\u00EDquido
   **/
  @ApiModelProperty(value = "Valor l\u00EDquido")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * Valor dos encargos banc\u00E1rios
   **/
  @ApiModelProperty(value = "Valor dos encargos banc\u00E1rios")
  public BigDecimal getValorEncargosBancarios() {
    return valorEncargosBancarios;
  }
  public void setValorEncargosBancarios(BigDecimal valorEncargosBancarios) {
    this.valorEncargosBancarios = valorEncargosBancarios;
  }

  
  /**
   * Valor das garantias
   **/
  @ApiModelProperty(value = "Valor das garantias")
  public BigDecimal getValorGarantias() {
    return valorGarantias;
  }
  public void setValorGarantias(BigDecimal valorGarantias) {
    this.valorGarantias = valorGarantias;
  }

  
  /**
   * Valor do agenciamento
   **/
  @ApiModelProperty(value = "Valor do agenciamento")
  public BigDecimal getValorAgenciamento() {
    return valorAgenciamento;
  }
  public void setValorAgenciamento(BigDecimal valorAgenciamento) {
    this.valorAgenciamento = valorAgenciamento;
  }

  
  /**
   * Origem da resolu\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Origem da resolu\u00E7\u00E3o")
  public String getOrigemResolucao() {
    return origemResolucao;
  }
  public void setOrigemResolucao(String origemResolucao) {
    this.origemResolucao = origemResolucao;
  }

  
  /**
   * Identificador de origem
   **/
  @ApiModelProperty(value = "Identificador de origem")
  public Long getIdOrigem() {
    return idOrigem;
  }
  public void setIdOrigem(Long idOrigem) {
    this.idOrigem = idOrigem;
  }

  
  /**
   * N\u00FAmero de refer\u00EAncia de aquisi\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "N\u00FAmero de refer\u00EAncia de aquisi\u00E7\u00E3o")
  public String getAcquireReferenceNumber() {
    return acquireReferenceNumber;
  }
  public void setAcquireReferenceNumber(String acquireReferenceNumber) {
    this.acquireReferenceNumber = acquireReferenceNumber;
  }

  
  /**
   * Informa\u00E7\u00F5es de autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Informa\u00E7\u00F5es de autoriza\u00E7\u00E3o")
  public AutorizacaoResponse getAutorizacao() {
    return autorizacao;
  }
  public void setAutorizacao(AutorizacaoResponse autorizacao) {
    this.autorizacao = autorizacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventoExternoCompraResponse {\n");
    
    sb.append("  dvnumeroEstabelecimento: ").append(dvnumeroEstabelecimento).append("\n");
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  tipoEntrada: ").append(tipoEntrada).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  valorEncargosTotais: ").append(valorEncargosTotais).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  dataEntradaCompra: ").append(dataEntradaCompra).append("\n");
    sb.append("  dataVencimentoPadrao: ").append(dataVencimentoPadrao).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  carencia: ").append(carencia).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  valorOrigem: ").append(valorOrigem).append("\n");
    sb.append("  idIncoming: ").append(idIncoming).append("\n");
    sb.append("  idEstabelecimentoVISA: ").append(idEstabelecimentoVISA).append("\n");
    sb.append("  nomeEstabelecimentoVISA: ").append(nomeEstabelecimentoVISA).append("\n");
    sb.append("  idEstabelecimentoExterno: ").append(idEstabelecimentoExterno).append("\n");
    sb.append("  idAutorizacao: ").append(idAutorizacao).append("\n");
    sb.append("  idMovimento: ").append(idMovimento).append("\n");
    sb.append("  idRemessa: ").append(idRemessa).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  numeroContrato: ").append(numeroContrato).append("\n");
    sb.append("  idContaPortador: ").append(idContaPortador).append("\n");
    sb.append("  dataMovimento: ").append(dataMovimento).append("\n");
    sb.append("  lote: ").append(lote).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  quantidadeMoeda: ").append(quantidadeMoeda).append("\n");
    sb.append("  fatorTotalAjustado: ").append(fatorTotalAjustado).append("\n");
    sb.append("  fatorBancoAjustado: ").append(fatorBancoAjustado).append("\n");
    sb.append("  fatorTaxaAdministracao: ").append(fatorTaxaAdministracao).append("\n");
    sb.append("  fatorComissaoGarantia: ").append(fatorComissaoGarantia).append("\n");
    sb.append("  fatorTotal: ").append(fatorTotal).append("\n");
    sb.append("  dataFinanciamento: ").append(dataFinanciamento).append("\n");
    sb.append("  dataVencimentoCompraInicial: ").append(dataVencimentoCompraInicial).append("\n");
    sb.append("  dataVencimentoCompraFinal: ").append(dataVencimentoCompraFinal).append("\n");
    sb.append("  flagSelecionado: ").append(flagSelecionado).append("\n");
    sb.append("  flagRefinanciamento: ").append(flagRefinanciamento).append("\n");
    sb.append("  tipoCompra: ").append(tipoCompra).append("\n");
    sb.append("  tipoPagamento: ").append(tipoPagamento).append("\n");
    sb.append("  tipoCalculoPrestacao: ").append(tipoCalculoPrestacao).append("\n");
    sb.append("  tipoLiquidacao: ").append(tipoLiquidacao).append("\n");
    sb.append("  idCredor: ").append(idCredor).append("\n");
    sb.append("  valorComissao: ").append(valorComissao).append("\n");
    sb.append("  valorLiquido: ").append(valorLiquido).append("\n");
    sb.append("  valorEncargosBancarios: ").append(valorEncargosBancarios).append("\n");
    sb.append("  valorGarantias: ").append(valorGarantias).append("\n");
    sb.append("  valorAgenciamento: ").append(valorAgenciamento).append("\n");
    sb.append("  origemResolucao: ").append(origemResolucao).append("\n");
    sb.append("  idOrigem: ").append(idOrigem).append("\n");
    sb.append("  acquireReferenceNumber: ").append(acquireReferenceNumber).append("\n");
    sb.append("  autorizacao: ").append(autorizacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

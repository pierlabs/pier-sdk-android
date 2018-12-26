package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto transacao processada e N\u00E3o Processada
 **/
@ApiModel(description = "Objeto transacao processada e N\u00E3o Processada")
public class TransacaoProcessadaNaoProcessadaResponse  {
  
  @SerializedName("cartaoMascarado")
  private String cartaoMascarado = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("codigoMCC")
  private Long codigoMCC = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("codigoMoedaOrigem")
  private String codigoMoedaOrigem = null;
  @SerializedName("codigoReferencia")
  private String codigoReferencia = null;
  @SerializedName("codigoTerminal")
  private String codigoTerminal = null;
  @SerializedName("cotacaoUSD")
  private BigDecimal cotacaoUSD = null;
  @SerializedName("dataCotacaoUSD")
  private String dataCotacaoUSD = null;
  @SerializedName("dataFaturamento")
  private String dataFaturamento = null;
  @SerializedName("dataOrigem")
  private String dataOrigem = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("descricaoAbreviada")
  private String descricaoAbreviada = null;
  @SerializedName("descricaoTipoTransacaoNaoProcessada")
  private String descricaoTipoTransacaoNaoProcessada = null;
  @SerializedName("flagCredito")
  private Integer flagCredito = null;
  @SerializedName("flagFaturado")
  private Integer flagFaturado = null;
  @SerializedName("grupoDescricaoMCC")
  private String grupoDescricaoMCC = null;
  @SerializedName("grupoMCC")
  private Long grupoMCC = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idEventoAjuste")
  private Long idEventoAjuste = null;
  @SerializedName("idTipoTransacaoNaoProcessada")
  private Long idTipoTransacaoNaoProcessada = null;
  @SerializedName("idTransacaoEstorno")
  private Long idTransacaoEstorno = null;
  @SerializedName("localidadeEstabelecimento")
  private String localidadeEstabelecimento = null;
  @SerializedName("modoEntradaTransacao")
  private String modoEntradaTransacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("parcela")
  private Long parcela = null;
  @SerializedName("plano")
  private Long plano = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("taxaEmbarque")
  private BigDecimal taxaEmbarque = null;
  @SerializedName("valorBRL")
  private BigDecimal valorBRL = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorUSD")
  private BigDecimal valorUSD = null;

  
  /**
   * N\u00FAmero do Cart\u00E3o em Formato 0000XXXXXXXX0000
   **/
  @ApiModelProperty(value = "N\u00FAmero do Cart\u00E3o em Formato 0000XXXXXXXX0000")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * C\u00F3digo de Autoriza\u00E7\u00E3o da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Autoriza\u00E7\u00E3o da Transa\u00E7\u00E3o")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da categoria do Estabelecimento
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da categoria do Estabelecimento")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Moeda da Transa\u00E7\u00E3o ap\u00F3s a convers\u00E3o, seguindo padr\u00E3o ISO 4217
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Moeda da Transa\u00E7\u00E3o ap\u00F3s a convers\u00E3o, seguindo padr\u00E3o ISO 4217")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Moeda utilizada na Transa\u00E7\u00E3o, seguindo padr\u00E3o ISO 4217
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Moeda utilizada na Transa\u00E7\u00E3o, seguindo padr\u00E3o ISO 4217")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * C\u00F3digo de Refer\u00EAncia da Transa\u00E7\u00E3o quando utilizado Cart\u00E3o Bandeirado
   **/
  @ApiModelProperty(value = "C\u00F3digo de Refer\u00EAncia da Transa\u00E7\u00E3o quando utilizado Cart\u00E3o Bandeirado")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da origem da captura da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da origem da captura da Transa\u00E7\u00E3o")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * Valor do D\u00F3lar Americano (USD) convertido em Real (BRL)
   **/
  @ApiModelProperty(value = "Valor do D\u00F3lar Americano (USD) convertido em Real (BRL)")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * Data de Fechamento da Cota\u00E7\u00E3o do D\u00F3lar Americano (USD)
   **/
  @ApiModelProperty(value = "Data de Fechamento da Cota\u00E7\u00E3o do D\u00F3lar Americano (USD)")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * Data de Faturamento da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data de Faturamento da Transa\u00E7\u00E3o")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * Data em que a Transa\u00E7\u00E3o foi realizada
   **/
  @ApiModelProperty(value = "Data em que a Transa\u00E7\u00E3o foi realizada")
  public String getDataOrigem() {
    return dataOrigem;
  }
  public void setDataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
  }

  
  /**
   * Data de Vencimento da Fatura
   **/
  @ApiModelProperty(value = "Data de Vencimento da Fatura")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Descri\u00E7\u00E3o Abreviada da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o Abreviada da Transa\u00E7\u00E3o")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Descri\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o n\u00E3o Processada
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o n\u00E3o Processada")
  public String getDescricaoTipoTransacaoNaoProcessada() {
    return descricaoTipoTransacaoNaoProcessada;
  }
  public void setDescricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00E7\u00E3o \u00E9 do Tipo 'Cr\u00E9dito'
   **/
  @ApiModelProperty(value = "Quando ativa, indica que a Transa\u00E7\u00E3o \u00E9 do Tipo 'Cr\u00E9dito'")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Quando ativa, indica que a Transa\u00E7\u00E3o foi consolidada em uma Fatura
   **/
  @ApiModelProperty(value = "Quando ativa, indica que a Transa\u00E7\u00E3o foi consolidada em uma Fatura")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * Descri\u00E7\u00E3o do grupo do Estabelecimento
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do grupo do Estabelecimento")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do grupo do Estabelecimento
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do grupo do Estabelecimento")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento (id)")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Evento Ajuste
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Evento Ajuste")
  public Long getIdEventoAjuste() {
    return idEventoAjuste;
  }
  public void setIdEventoAjuste(Long idEventoAjuste) {
    this.idEventoAjuste = idEventoAjuste;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo da Transa\u00E7\u00E3o")
  public Long getIdTipoTransacaoNaoProcessada() {
    return idTipoTransacaoNaoProcessada;
  }
  public void setIdTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Transa\u00E7\u00E3o (id) que gerou o estorno
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Transa\u00E7\u00E3o (id) que gerou o estorno")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  
  /**
   * Localidade do Estabelecimento
   **/
  @ApiModelProperty(value = "Localidade do Estabelecimento")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * Descreve o modo utilizado para realizar a leitura dos dados do cart\u00E3o para realizar a Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descreve o modo utilizado para realizar a leitura dos dados do cart\u00E3o para realizar a Transa\u00E7\u00E3o")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * Nome do Estabelecimento
   **/
  @ApiModelProperty(value = "Nome do Estabelecimento")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Nome Fantasia do Estabelecimento
   **/
  @ApiModelProperty(value = "Nome Fantasia do Estabelecimento")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Nome completo do Portador do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome completo do Portador do Cart\u00E3o")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero da Parcela
   **/
  @ApiModelProperty(value = "Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero da Parcela")
  public Long getParcela() {
    return parcela;
  }
  public void setParcela(Long parcela) {
    this.parcela = parcela;
  }

  
  /**
   * Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero total de Parcelas
   **/
  @ApiModelProperty(value = "Quando a Transa\u00E7\u00E3o for do tipo Parcelada, apresenta o n\u00FAmero total de Parcelas")
  public Long getPlano() {
    return plano;
  }
  public void setPlano(Long plano) {
    this.plano = plano;
  }

  
  /**
   * Atributo que representa o c\u00F3digo identificador do status da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Atributo que representa o c\u00F3digo identificador do status da transa\u00E7\u00E3o")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Valor da Taxa de Embarque em Real (BRL) quando a transa\u00E7\u00E3o for relacionada a Compra de Passagens A\u00E9reas
   **/
  @ApiModelProperty(value = "Valor da Taxa de Embarque em Real (BRL) quando a transa\u00E7\u00E3o for relacionada a Compra de Passagens A\u00E9reas")
  public BigDecimal getTaxaEmbarque() {
    return taxaEmbarque;
  }
  public void setTaxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
  }

  
  /**
   * Valor da Transa\u00E7\u00E3o em Real (BRL)
   **/
  @ApiModelProperty(value = "Valor da Transa\u00E7\u00E3o em Real (BRL)")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Valor da Entrada em Real (BRL) quando a transa\u00E7\u00E3o for do tipo Parcelada com o pagamento de um valor de Entrada
   **/
  @ApiModelProperty(value = "Valor da Entrada em Real (BRL) quando a transa\u00E7\u00E3o for do tipo Parcelada com o pagamento de um valor de Entrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Valor da Transa\u00E7\u00E3o em D\u00F3lar Americano (USD)
   **/
  @ApiModelProperty(value = "Valor da Transa\u00E7\u00E3o em D\u00F3lar Americano (USD)")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoProcessadaNaoProcessadaResponse {\n");
    
    sb.append("  cartaoMascarado: ").append(cartaoMascarado).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  codigoMCC: ").append(codigoMCC).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  codigoMoedaOrigem: ").append(codigoMoedaOrigem).append("\n");
    sb.append("  codigoReferencia: ").append(codigoReferencia).append("\n");
    sb.append("  codigoTerminal: ").append(codigoTerminal).append("\n");
    sb.append("  cotacaoUSD: ").append(cotacaoUSD).append("\n");
    sb.append("  dataCotacaoUSD: ").append(dataCotacaoUSD).append("\n");
    sb.append("  dataFaturamento: ").append(dataFaturamento).append("\n");
    sb.append("  dataOrigem: ").append(dataOrigem).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  descricaoAbreviada: ").append(descricaoAbreviada).append("\n");
    sb.append("  descricaoTipoTransacaoNaoProcessada: ").append(descricaoTipoTransacaoNaoProcessada).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  flagFaturado: ").append(flagFaturado).append("\n");
    sb.append("  grupoDescricaoMCC: ").append(grupoDescricaoMCC).append("\n");
    sb.append("  grupoMCC: ").append(grupoMCC).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idEventoAjuste: ").append(idEventoAjuste).append("\n");
    sb.append("  idTipoTransacaoNaoProcessada: ").append(idTipoTransacaoNaoProcessada).append("\n");
    sb.append("  idTransacaoEstorno: ").append(idTransacaoEstorno).append("\n");
    sb.append("  localidadeEstabelecimento: ").append(localidadeEstabelecimento).append("\n");
    sb.append("  modoEntradaTransacao: ").append(modoEntradaTransacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  parcela: ").append(parcela).append("\n");
    sb.append("  plano: ").append(plano).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  taxaEmbarque: ").append(taxaEmbarque).append("\n");
    sb.append("  valorBRL: ").append(valorBRL).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorUSD: ").append(valorUSD).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

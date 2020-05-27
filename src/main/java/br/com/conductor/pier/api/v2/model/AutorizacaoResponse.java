package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de retorno de autoriza\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto de retorno de autoriza\u00E7\u00E3o")
public class AutorizacaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("nsuOrigem")
  private Long nsuOrigem = null;
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("dataAutorizacao")
  private String dataAutorizacao = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("terminal")
  private String terminal = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("flagParticipaPromocao")
  private Integer flagParticipaPromocao = null;
  @SerializedName("referenceNumber")
  private String referenceNumber = null;
  @SerializedName("identificacaoTransacao")
  private Long identificacaoTransacao = null;
  @SerializedName("modoEntrada")
  private String modoEntrada = null;
  @SerializedName("codCondicaoPOS")
  private String codCondicaoPOS = null;
  @SerializedName("idCapacidadeDevice")
  private String idCapacidadeDevice = null;
  @SerializedName("idTipoEstabelecimentoPreAutorizacao")
  private String idTipoEstabelecimentoPreAutorizacao = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("dataLocal")
  private String dataLocal = null;
  @SerializedName("horaLocal")
  private String horaLocal = null;
  @SerializedName("estabelecimentoAutenticado")
  private Integer estabelecimentoAutenticado = null;

  
  /**
   * Identificador da autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identificador da autoriza\u00E7\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de autoriza\u00E7\u00E3o")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * NSU de origem
   **/
  @ApiModelProperty(value = "NSU de origem")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
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
   * N\u00FAmero do estabelecimento
   **/
  @ApiModelProperty(value = "N\u00FAmero do estabelecimento")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Data de autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data de autoriza\u00E7\u00E3o")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * Origem da autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Origem da autoriza\u00E7\u00E3o")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Valor da autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor da autoriza\u00E7\u00E3o")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
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
   * C\u00F3digo da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo da opera\u00E7\u00E3o")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Terminal de autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Terminal de autoriza\u00E7\u00E3o")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * Status da autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Status da autoriza\u00E7\u00E3o")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * C\u00F3digo do emissor
   **/
  @ApiModelProperty(value = "C\u00F3digo do emissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Flag de participa\u00E7\u00E3o em promo\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Flag de participa\u00E7\u00E3o em promo\u00E7\u00E3o")
  public Integer getFlagParticipaPromocao() {
    return flagParticipaPromocao;
  }
  public void setFlagParticipaPromocao(Integer flagParticipaPromocao) {
    this.flagParticipaPromocao = flagParticipaPromocao;
  }

  
  /**
   * N\u00FAmero de refer\u00EAncia
   **/
  @ApiModelProperty(value = "N\u00FAmero de refer\u00EAncia")
  public String getReferenceNumber() {
    return referenceNumber;
  }
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  
  /**
   * Identifica\u00E7\u00E3o de transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o de transa\u00E7\u00E3o")
  public Long getIdentificacaoTransacao() {
    return identificacaoTransacao;
  }
  public void setIdentificacaoTransacao(Long identificacaoTransacao) {
    this.identificacaoTransacao = identificacaoTransacao;
  }

  
  /**
   * Modo de entrada
   **/
  @ApiModelProperty(value = "Modo de entrada")
  public String getModoEntrada() {
    return modoEntrada;
  }
  public void setModoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  
  /**
   * C\u00F3digo de condi\u00E7\u00E3o POD
   **/
  @ApiModelProperty(value = "C\u00F3digo de condi\u00E7\u00E3o POD")
  public String getCodCondicaoPOS() {
    return codCondicaoPOS;
  }
  public void setCodCondicaoPOS(String codCondicaoPOS) {
    this.codCondicaoPOS = codCondicaoPOS;
  }

  
  /**
   * C\u00F3digo de capacidade de dispositivo
   **/
  @ApiModelProperty(value = "C\u00F3digo de capacidade de dispositivo")
  public String getIdCapacidadeDevice() {
    return idCapacidadeDevice;
  }
  public void setIdCapacidadeDevice(String idCapacidadeDevice) {
    this.idCapacidadeDevice = idCapacidadeDevice;
  }

  
  /**
   * C\u00F3digo do estabelecimento de pr\u00E9 autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo do estabelecimento de pr\u00E9 autoriza\u00E7\u00E3o")
  public String getIdTipoEstabelecimentoPreAutorizacao() {
    return idTipoEstabelecimentoPreAutorizacao;
  }
  public void setIdTipoEstabelecimentoPreAutorizacao(String idTipoEstabelecimentoPreAutorizacao) {
    this.idTipoEstabelecimentoPreAutorizacao = idTipoEstabelecimentoPreAutorizacao;
  }

  
  /**
   * C\u00F3digo de cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Data/Local de autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data/Local de autoriza\u00E7\u00E3o")
  public String getDataLocal() {
    return dataLocal;
  }
  public void setDataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
  }

  
  /**
   * Hora/Local de autoriza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Hora/Local de autoriza\u00E7\u00E3o")
  public String getHoraLocal() {
    return horaLocal;
  }
  public void setHoraLocal(String horaLocal) {
    this.horaLocal = horaLocal;
  }

  
  /**
   * Estabelecimento autenticado
   **/
  @ApiModelProperty(value = "Estabelecimento autenticado")
  public Integer getEstabelecimentoAutenticado() {
    return estabelecimentoAutenticado;
  }
  public void setEstabelecimentoAutenticado(Integer estabelecimentoAutenticado) {
    this.estabelecimentoAutenticado = estabelecimentoAutenticado;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutorizacaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  dataAutorizacao: ").append(dataAutorizacao).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  terminal: ").append(terminal).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  flagParticipaPromocao: ").append(flagParticipaPromocao).append("\n");
    sb.append("  referenceNumber: ").append(referenceNumber).append("\n");
    sb.append("  identificacaoTransacao: ").append(identificacaoTransacao).append("\n");
    sb.append("  modoEntrada: ").append(modoEntrada).append("\n");
    sb.append("  codCondicaoPOS: ").append(codCondicaoPOS).append("\n");
    sb.append("  idCapacidadeDevice: ").append(idCapacidadeDevice).append("\n");
    sb.append("  idTipoEstabelecimentoPreAutorizacao: ").append(idTipoEstabelecimentoPreAutorizacao).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  dataLocal: ").append(dataLocal).append("\n");
    sb.append("  horaLocal: ").append(horaLocal).append("\n");
    sb.append("  estabelecimentoAutenticado: ").append(estabelecimentoAutenticado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CdtAutorizacao  {
  
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("codCondicaoPOS")
  private String codCondicaoPOS = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("dataAutorizacao")
  private String dataAutorizacao = null;
  @SerializedName("dataLocal")
  private String dataLocal = null;
  @SerializedName("estabelecimentoAutenticado")
  private Integer estabelecimentoAutenticado = null;
  @SerializedName("flagParticipaPromocao")
  private Integer flagParticipaPromocao = null;
  @SerializedName("horaLocal")
  private String horaLocal = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCapacidadeDevice")
  private String idCapacidadeDevice = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("idTipoEstabelecimentoPreAutorizacao")
  private String idTipoEstabelecimentoPreAutorizacao = null;
  @SerializedName("identificacaoTransacao")
  private Long identificacaoTransacao = null;
  @SerializedName("modoEntrada")
  private String modoEntrada = null;
  @SerializedName("nsuOrigem")
  private Long nsuOrigem = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("referenceNumber")
  private String referenceNumber = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("terminal")
  private String terminal = null;
  @SerializedName("valor")
  private BigDecimal valor = null;

  
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
  public String getCodCondicaoPOS() {
    return codCondicaoPOS;
  }
  public void setCodCondicaoPOS(String codCondicaoPOS) {
    this.codCondicaoPOS = codCondicaoPOS;
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
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataLocal() {
    return dataLocal;
  }
  public void setDataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEstabelecimentoAutenticado() {
    return estabelecimentoAutenticado;
  }
  public void setEstabelecimentoAutenticado(Integer estabelecimentoAutenticado) {
    this.estabelecimentoAutenticado = estabelecimentoAutenticado;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagParticipaPromocao() {
    return flagParticipaPromocao;
  }
  public void setFlagParticipaPromocao(Integer flagParticipaPromocao) {
    this.flagParticipaPromocao = flagParticipaPromocao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getHoraLocal() {
    return horaLocal;
  }
  public void setHoraLocal(String horaLocal) {
    this.horaLocal = horaLocal;
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
  public String getIdCapacidadeDevice() {
    return idCapacidadeDevice;
  }
  public void setIdCapacidadeDevice(String idCapacidadeDevice) {
    this.idCapacidadeDevice = idCapacidadeDevice;
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
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getIdTipoEstabelecimentoPreAutorizacao() {
    return idTipoEstabelecimentoPreAutorizacao;
  }
  public void setIdTipoEstabelecimentoPreAutorizacao(String idTipoEstabelecimentoPreAutorizacao) {
    this.idTipoEstabelecimentoPreAutorizacao = idTipoEstabelecimentoPreAutorizacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdentificacaoTransacao() {
    return identificacaoTransacao;
  }
  public void setIdentificacaoTransacao(Long identificacaoTransacao) {
    this.identificacaoTransacao = identificacaoTransacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getModoEntrada() {
    return modoEntrada;
  }
  public void setModoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
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
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getReferenceNumber() {
    return referenceNumber;
  }
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtAutorizacao {\n");
    
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  codCondicaoPOS: ").append(codCondicaoPOS).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  dataAutorizacao: ").append(dataAutorizacao).append("\n");
    sb.append("  dataLocal: ").append(dataLocal).append("\n");
    sb.append("  estabelecimentoAutenticado: ").append(estabelecimentoAutenticado).append("\n");
    sb.append("  flagParticipaPromocao: ").append(flagParticipaPromocao).append("\n");
    sb.append("  horaLocal: ").append(horaLocal).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCapacidadeDevice: ").append(idCapacidadeDevice).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  idTipoEstabelecimentoPreAutorizacao: ").append(idTipoEstabelecimentoPreAutorizacao).append("\n");
    sb.append("  identificacaoTransacao: ").append(identificacaoTransacao).append("\n");
    sb.append("  modoEntrada: ").append(modoEntrada).append("\n");
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  referenceNumber: ").append(referenceNumber).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  terminal: ").append(terminal).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso transacao
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso transacao")
public class TransacaoResponse  {
  
  @SerializedName("ultimaParcelaLancada")
  private Integer ultimaParcelaLancada = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoRegistro")
  private Long idTipoRegistro = null;
  @SerializedName("ordem")
  private Long ordem = null;
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("status")
  private Long status = null;
  @SerializedName("descricaoStatus")
  private String descricaoStatus = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("valorDolar")
  private BigDecimal valorDolar = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("dataEvento")
  private Date dataEvento = null;
  @SerializedName("estabelecimento")
  private String estabelecimento = null;
  @SerializedName("flagCredito")
  private Integer flagCredito = null;
  @SerializedName("tipoEstabelecimento")
  private String tipoEstabelecimento = null;
  @SerializedName("latitude")
  private String latitude = null;
  @SerializedName("longetude")
  private String longetude = null;
  @SerializedName("idGrupoMCC")
  private Integer idGrupoMCC = null;
  @SerializedName("flagSolicitouContestacao")
  private Integer flagSolicitouContestacao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUltimaParcelaLancada() {
    return ultimaParcelaLancada;
  }
  public void setUltimaParcelaLancada(Integer ultimaParcelaLancada) {
    this.ultimaParcelaLancada = ultimaParcelaLancada;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transacao (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transacao (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de transacao (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de transacao (id).")
  public Long getIdTipoRegistro() {
    return idTipoRegistro;
  }
  public void setIdTipoRegistro(Long idTipoRegistro) {
    this.idTipoRegistro = idTipoRegistro;
  }

  
  /**
   * Representa\u00C3\u00A7\u00C3\u00A3o da ordena\u00C3\u00A7\u00C3\u00A3o da transacao (id).
   **/
  @ApiModelProperty(value = "Representa\u00C3\u00A7\u00C3\u00A3o da ordena\u00C3\u00A7\u00C3\u00A3o da transacao (id).")
  public Long getOrdem() {
    return ordem;
  }
  public void setOrdem(Long ordem) {
    this.ordem = ordem;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transacao (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transacao (id).")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
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
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoStatus() {
    return descricaoStatus;
  }
  public void setDescricaoStatus(String descricaoStatus) {
    this.descricaoStatus = descricaoStatus;
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(BigDecimal valorDolar) {
    this.valorDolar = valorDolar;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
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
  public Date getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(Date dataEvento) {
    this.dataEvento = dataEvento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTipoEstabelecimento() {
    return tipoEstabelecimento;
  }
  public void setTipoEstabelecimento(String tipoEstabelecimento) {
    this.tipoEstabelecimento = tipoEstabelecimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLongetude() {
    return longetude;
  }
  public void setLongetude(String longetude) {
    this.longetude = longetude;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Integer idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Integer flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoResponse {\n");
    
    sb.append("  ultimaParcelaLancada: ").append(ultimaParcelaLancada).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoRegistro: ").append(idTipoRegistro).append("\n");
    sb.append("  ordem: ").append(ordem).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  descricaoStatus: ").append(descricaoStatus).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  valorDolar: ").append(valorDolar).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  dataEvento: ").append(dataEvento).append("\n");
    sb.append("  estabelecimento: ").append(estabelecimento).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  tipoEstabelecimento: ").append(tipoEstabelecimento).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longetude: ").append(longetude).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  flagSolicitouContestacao: ").append(flagSolicitouContestacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



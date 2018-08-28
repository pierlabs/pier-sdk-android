package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{lancamento_fatura_response_description}}}
 **/
@ApiModel(description = "{{{lancamento_fatura_response_description}}}")
public class LancamentoFaturaResponse  {
  
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("descricaoTipoTransacao")
  private String descricaoTipoTransacao = null;
  @SerializedName("idTipoEvento")
  private Long idTipoEvento = null;
  @SerializedName("descricaoTipoEvento")
  private String descricaoTipoEvento = null;
  @SerializedName("idEvento")
  private Long idEvento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("valorBRL")
  private BigDecimal valorBRL = null;
  @SerializedName("valorUSD")
  private BigDecimal valorUSD = null;
  @SerializedName("numeroParcela")
  private Integer numeroParcela = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("dataHoraTransacao")
  private String dataHoraTransacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("descricaoEstabelecimento")
  private String descricaoEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("flagCredito")
  private Boolean flagCredito = null;
  @SerializedName("idMCC")
  private Long idMCC = null;
  @SerializedName("idGrupoMCC")
  private Long idGrupoMCC = null;
  @SerializedName("descricaoGrupoMCC")
  private String descricaoGrupoMCC = null;
  @SerializedName("titular")
  private Boolean titular = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("numeroCartaoMascarado")
  private String numeroCartaoMascarado = null;
  @SerializedName("flagSolicitouContestacao")
  private Boolean flagSolicitouContestacao = null;
  @SerializedName("valorTaxaEmbarque")
  private BigDecimal valorTaxaEmbarque = null;
  @SerializedName("descricaoAbreviada")
  private String descricaoAbreviada = null;

  
  /**
   * {{{lancamento_fatura_response_id_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_id_transacao_value}}}")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * {{{lancamento_fatura_response_descricao_tipo_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_descricao_tipo_transacao_value}}}")
  public String getDescricaoTipoTransacao() {
    return descricaoTipoTransacao;
  }
  public void setDescricaoTipoTransacao(String descricaoTipoTransacao) {
    this.descricaoTipoTransacao = descricaoTipoTransacao;
  }

  
  /**
   * {{{lancamento_fatura_response_id_tipo_evento_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_id_tipo_evento_value}}}")
  public Long getIdTipoEvento() {
    return idTipoEvento;
  }
  public void setIdTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  
  /**
   * {{{lancamento_fatura_response_descricao_tipo_evento_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_descricao_tipo_evento_value}}}")
  public String getDescricaoTipoEvento() {
    return descricaoTipoEvento;
  }
  public void setDescricaoTipoEvento(String descricaoTipoEvento) {
    this.descricaoTipoEvento = descricaoTipoEvento;
  }

  
  /**
   * {{{lancamento_fatura_response_id_evento_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_id_evento_value}}}")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * {{{lancamento_fatura_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{lancamento_fatura_response_complemento_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_complemento_value}}}")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * {{{lancamento_fatura_response_valor_b_r_l_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_valor_b_r_l_value}}}")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * {{{lancamento_fatura_response_valor_u_s_d_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_valor_u_s_d_value}}}")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  
  /**
   * {{{lancamento_fatura_response_numero_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_numero_parcela_value}}}")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * {{{lancamento_fatura_response_quantidade_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_quantidade_parcelas_value}}}")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{lancamento_fatura_response_data_hora_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_data_hora_transacao_value}}}")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * {{{lancamento_fatura_response_nome_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_nome_estabelecimento_value}}}")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{lancamento_fatura_response_descricao_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_descricao_estabelecimento_value}}}")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * {{{lancamento_fatura_response_nome_fantasia_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_nome_fantasia_estabelecimento_value}}}")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * {{{lancamento_fatura_response_flag_credito_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_flag_credito_value}}}")
  public Boolean getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Boolean flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * {{{lancamento_fatura_response_id_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_id_m_c_c_value}}}")
  public Long getIdMCC() {
    return idMCC;
  }
  public void setIdMCC(Long idMCC) {
    this.idMCC = idMCC;
  }

  
  /**
   * {{{lancamento_fatura_response_id_grupo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_id_grupo_m_c_c_value}}}")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * {{{lancamento_fatura_response_descricao_grupo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_descricao_grupo_m_c_c_value}}}")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * {{{lancamento_fatura_response_titular_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_titular_value}}}")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * {{{lancamento_fatura_response_nome_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_nome_portador_value}}}")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * {{{lancamento_fatura_response_numero_cartao_mascarado_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_numero_cartao_mascarado_value}}}")
  public String getNumeroCartaoMascarado() {
    return numeroCartaoMascarado;
  }
  public void setNumeroCartaoMascarado(String numeroCartaoMascarado) {
    this.numeroCartaoMascarado = numeroCartaoMascarado;
  }

  
  /**
   * {{{lancamento_fatura_response_flag_solicitou_contestacao_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_flag_solicitou_contestacao_value}}}")
  public Boolean getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Boolean flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  
  /**
   * {{{lancamento_fatura_response_valor_taxa_embarque_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_valor_taxa_embarque_value}}}")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * {{{lancamento_fatura_response_descricao_abreviada_value}}}
   **/
  @ApiModelProperty(value = "{{{lancamento_fatura_response_descricao_abreviada_value}}}")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LancamentoFaturaResponse {\n");
    
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  descricaoTipoTransacao: ").append(descricaoTipoTransacao).append("\n");
    sb.append("  idTipoEvento: ").append(idTipoEvento).append("\n");
    sb.append("  descricaoTipoEvento: ").append(descricaoTipoEvento).append("\n");
    sb.append("  idEvento: ").append(idEvento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  valorBRL: ").append(valorBRL).append("\n");
    sb.append("  valorUSD: ").append(valorUSD).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  dataHoraTransacao: ").append(dataHoraTransacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  descricaoEstabelecimento: ").append(descricaoEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  idMCC: ").append(idMCC).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  descricaoGrupoMCC: ").append(descricaoGrupoMCC).append("\n");
    sb.append("  titular: ").append(titular).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  numeroCartaoMascarado: ").append(numeroCartaoMascarado).append("\n");
    sb.append("  flagSolicitouContestacao: ").append(flagSolicitouContestacao).append("\n");
    sb.append("  valorTaxaEmbarque: ").append(valorTaxaEmbarque).append("\n");
    sb.append("  descricaoAbreviada: ").append(descricaoAbreviada).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{grupo_economico_response_description}}}
 **/
@ApiModel(description = "{{{grupo_economico_response_description}}}")
public class GrupoEconomicoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("nomeCredor")
  private String nomeCredor = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("banco")
  private Integer banco = null;
  @SerializedName("agencia")
  private Integer agencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("digitoContaCorrente")
  private String digitoContaCorrente = null;
  @SerializedName("usuario")
  private String usuario = null;
  public enum PeriodicidadeEnum {
     DIARIO,  SEMANAL,  MENSAL,  DECENDIAL,  QUINZENAL, 
  };
  @SerializedName("periodicidade")
  private PeriodicidadeEnum periodicidade = null;
  public enum PagamentoSemanalEnum {
     SEGUNDA,  TERCA,  QUARTA,  QUINTA,  SEXTA,  SABADO,  DOMINGO, 
  };
  @SerializedName("pagamentoSemanal")
  private PagamentoSemanalEnum pagamentoSemanal = null;
  @SerializedName("pagamentoMensal")
  private Integer pagamentoMensal = null;
  @SerializedName("pagamentoDecendialPrimeiro")
  private Integer pagamentoDecendialPrimeiro = null;
  @SerializedName("pagamentoDecendialSegundo")
  private Integer pagamentoDecendialSegundo = null;
  @SerializedName("pagamentoDecendialTerceiro")
  private Integer pagamentoDecendialTerceiro = null;
  @SerializedName("pagamentoQuinzenalPrimeiro")
  private Integer pagamentoQuinzenalPrimeiro = null;
  @SerializedName("pagamentoQuinzenalSegundo")
  private Integer pagamentoQuinzenalSegundo = null;
  @SerializedName("idCredorRAV")
  private Long idCredorRAV = null;
  @SerializedName("percentualRAV")
  private BigDecimal percentualRAV = null;
  public enum RecebeRAVEnum {
     NAO_TEM_PERMISSAO_RAV,  CREDITO_RAV,  DEBITO_RAV, 
  };
  @SerializedName("recebeRAV")
  private RecebeRAVEnum recebeRAV = null;
  @SerializedName("percentualMultiplica")
  private BigDecimal percentualMultiplica = null;
  @SerializedName("taxaAdm")
  private BigDecimal taxaAdm = null;
  @SerializedName("taxaBanco")
  private BigDecimal taxaBanco = null;
  @SerializedName("limiteRAV")
  private BigDecimal limiteRAV = null;

  
  /**
   * {{{grupo_economico_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{grupo_economico_response_razao_social_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_razao_social_value}}}")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{grupo_economico_response_nome_credor_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_nome_credor_value}}}")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * {{{grupo_economico_response_numero_receita_federal_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_numero_receita_federal_value}}}")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{grupo_economico_response_inscricao_estadual_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_inscricao_estadual_value}}}")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * {{{grupo_economico_response_contato_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_contato_value}}}")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{grupo_economico_response_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_banco_value}}}")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * {{{grupo_economico_response_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_agencia_value}}}")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{grupo_economico_response_digito_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_digito_agencia_value}}}")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{grupo_economico_response_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_conta_corrente_value}}}")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{grupo_economico_response_digito_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_digito_conta_corrente_value}}}")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * {{{grupo_economico_response_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_usuario_value}}}")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{grupo_economico_response_periodicidade_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_periodicidade_value}}}")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_semanal_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_pagamento_semanal_value}}}")
  public PagamentoSemanalEnum getPagamentoSemanal() {
    return pagamentoSemanal;
  }
  public void setPagamentoSemanal(PagamentoSemanalEnum pagamentoSemanal) {
    this.pagamentoSemanal = pagamentoSemanal;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_mensal_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_pagamento_mensal_value}}}")
  public Integer getPagamentoMensal() {
    return pagamentoMensal;
  }
  public void setPagamentoMensal(Integer pagamentoMensal) {
    this.pagamentoMensal = pagamentoMensal;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_decendial_primeiro_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_pagamento_decendial_primeiro_value}}}")
  public Integer getPagamentoDecendialPrimeiro() {
    return pagamentoDecendialPrimeiro;
  }
  public void setPagamentoDecendialPrimeiro(Integer pagamentoDecendialPrimeiro) {
    this.pagamentoDecendialPrimeiro = pagamentoDecendialPrimeiro;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_decendial_segundo_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_pagamento_decendial_segundo_value}}}")
  public Integer getPagamentoDecendialSegundo() {
    return pagamentoDecendialSegundo;
  }
  public void setPagamentoDecendialSegundo(Integer pagamentoDecendialSegundo) {
    this.pagamentoDecendialSegundo = pagamentoDecendialSegundo;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_decendial_terceiro_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_pagamento_decendial_terceiro_value}}}")
  public Integer getPagamentoDecendialTerceiro() {
    return pagamentoDecendialTerceiro;
  }
  public void setPagamentoDecendialTerceiro(Integer pagamentoDecendialTerceiro) {
    this.pagamentoDecendialTerceiro = pagamentoDecendialTerceiro;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_quinzenal_primeiro_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_pagamento_quinzenal_primeiro_value}}}")
  public Integer getPagamentoQuinzenalPrimeiro() {
    return pagamentoQuinzenalPrimeiro;
  }
  public void setPagamentoQuinzenalPrimeiro(Integer pagamentoQuinzenalPrimeiro) {
    this.pagamentoQuinzenalPrimeiro = pagamentoQuinzenalPrimeiro;
  }

  
  /**
   * {{{grupo_economico_response_pagamento_quinzenal_segundo_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_pagamento_quinzenal_segundo_value}}}")
  public Integer getPagamentoQuinzenalSegundo() {
    return pagamentoQuinzenalSegundo;
  }
  public void setPagamentoQuinzenalSegundo(Integer pagamentoQuinzenalSegundo) {
    this.pagamentoQuinzenalSegundo = pagamentoQuinzenalSegundo;
  }

  
  /**
   * {{{grupo_economico_response_id_credor_r_a_v_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_id_credor_r_a_v_value}}}")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * {{{grupo_economico_response_percentual_r_a_v_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_percentual_r_a_v_value}}}")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * {{{grupo_economico_response_recebe_r_a_v_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_recebe_r_a_v_value}}}")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * {{{grupo_economico_response_percentual_multiplica_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_percentual_multiplica_value}}}")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * {{{grupo_economico_response_taxa_adm_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_taxa_adm_value}}}")
  public BigDecimal getTaxaAdm() {
    return taxaAdm;
  }
  public void setTaxaAdm(BigDecimal taxaAdm) {
    this.taxaAdm = taxaAdm;
  }

  
  /**
   * {{{grupo_economico_response_taxa_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_taxa_banco_value}}}")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * {{{grupo_economico_response_limite_r_a_v_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_economico_response_limite_r_a_v_value}}}")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoEconomicoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeCredor: ").append(nomeCredor).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoContaCorrente: ").append(digitoContaCorrente).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  periodicidade: ").append(periodicidade).append("\n");
    sb.append("  pagamentoSemanal: ").append(pagamentoSemanal).append("\n");
    sb.append("  pagamentoMensal: ").append(pagamentoMensal).append("\n");
    sb.append("  pagamentoDecendialPrimeiro: ").append(pagamentoDecendialPrimeiro).append("\n");
    sb.append("  pagamentoDecendialSegundo: ").append(pagamentoDecendialSegundo).append("\n");
    sb.append("  pagamentoDecendialTerceiro: ").append(pagamentoDecendialTerceiro).append("\n");
    sb.append("  pagamentoQuinzenalPrimeiro: ").append(pagamentoQuinzenalPrimeiro).append("\n");
    sb.append("  pagamentoQuinzenalSegundo: ").append(pagamentoQuinzenalSegundo).append("\n");
    sb.append("  idCredorRAV: ").append(idCredorRAV).append("\n");
    sb.append("  percentualRAV: ").append(percentualRAV).append("\n");
    sb.append("  recebeRAV: ").append(recebeRAV).append("\n");
    sb.append("  percentualMultiplica: ").append(percentualMultiplica).append("\n");
    sb.append("  taxaAdm: ").append(taxaAdm).append("\n");
    sb.append("  taxaBanco: ").append(taxaBanco).append("\n");
    sb.append("  limiteRAV: ").append(limiteRAV).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}



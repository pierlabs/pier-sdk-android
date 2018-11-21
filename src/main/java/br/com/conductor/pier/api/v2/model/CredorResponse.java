package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.EscritorioCobrancaDTO;
import br.com.conductor.pier.api.v2.model.TelefoneEscritorioCobrancaDTO;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CredorResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nomeCredor")
  private String nomeCredor = null;
  @SerializedName("diaPagamentoSemanal")
  private Integer diaPagamentoSemanal = null;
  @SerializedName("diaPagamentoMensal")
  private Integer diaPagamentoMensal = null;
  @SerializedName("diaPagamentoDecendialPrimeiro")
  private Integer diaPagamentoDecendialPrimeiro = null;
  @SerializedName("diaPagamentoDecendialSegundo")
  private Integer diaPagamentoDecendialSegundo = null;
  @SerializedName("diaPagamentoDecendialTerceiro")
  private Integer diaPagamentoDecendialTerceiro = null;
  @SerializedName("diaPagamentoQuinzenalPrimeiro")
  private Integer diaPagamentoQuinzenalPrimeiro = null;
  @SerializedName("diaPagamentoQuinzenalSegundo")
  private Integer diaPagamentoQuinzenalSegundo = null;
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
  @SerializedName("credorBanco")
  private Boolean credorBanco = null;
  @SerializedName("percentualRAV")
  private BigDecimal percentualRAV = null;
  public enum RecebeRAVEnum {
     NAO_TEM_PERMISSAO_RAV,  CREDITO_RAV,  DEBITO_RAV, 
  };
  @SerializedName("recebeRAV")
  private RecebeRAVEnum recebeRAV = null;
  @SerializedName("percentualMultiplica")
  private BigDecimal percentualMultiplica = null;
  @SerializedName("taxaAdministrativa")
  private BigDecimal taxaAdministrativa = null;
  @SerializedName("taxaBanco")
  private BigDecimal taxaBanco = null;
  @SerializedName("limiteRAV")
  private BigDecimal limiteRAV = null;
  @SerializedName("idCredorRAV")
  private Long idCredorRAV = null;
  public enum PeriodicidadeEnum {
     DIARIO,  SEMANAL,  MENSAL,  DECENDIAL,  QUINZENAL, 
  };
  @SerializedName("periodicidade")
  private PeriodicidadeEnum periodicidade = null;
  @SerializedName("idPessoaJuridica")
  private Long idPessoaJuridica = null;
  @SerializedName("flagEscritorioCobranca")
  private Boolean flagEscritorioCobranca = null;
  @SerializedName("escritoriosCobranca")
  private EscritorioCobrancaDTO escritoriosCobranca = null;
  @SerializedName("telefonesEscritoriosCobranca")
  private List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca = null;

  
  /**
   * {{{credor_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{credor_response_nome_credor_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_nome_credor_value}}}")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * {{{credor_response_pagamento_semanal_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_pagamento_semanal_value}}}")
  public Integer getDiaPagamentoSemanal() {
    return diaPagamentoSemanal;
  }
  public void setDiaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
  }

  
  /**
   * {{{credor_response_pagamento_mensal_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_pagamento_mensal_value}}}")
  public Integer getDiaPagamentoMensal() {
    return diaPagamentoMensal;
  }
  public void setDiaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
  }

  
  /**
   * {{{credor_response_pagamento_decendial_primeiro_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_pagamento_decendial_primeiro_value}}}")
  public Integer getDiaPagamentoDecendialPrimeiro() {
    return diaPagamentoDecendialPrimeiro;
  }
  public void setDiaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
  }

  
  /**
   * {{{credor_response_pagamento_decendial_segundo_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_pagamento_decendial_segundo_value}}}")
  public Integer getDiaPagamentoDecendialSegundo() {
    return diaPagamentoDecendialSegundo;
  }
  public void setDiaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
  }

  
  /**
   * {{{credor_response_pagamento_decendial_terceiro_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_pagamento_decendial_terceiro_value}}}")
  public Integer getDiaPagamentoDecendialTerceiro() {
    return diaPagamentoDecendialTerceiro;
  }
  public void setDiaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
  }

  
  /**
   * {{{credor_response_pagamento_quinzenal_primeiro_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_pagamento_quinzenal_primeiro_value}}}")
  public Integer getDiaPagamentoQuinzenalPrimeiro() {
    return diaPagamentoQuinzenalPrimeiro;
  }
  public void setDiaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
  }

  
  /**
   * {{{credor_response_pagamento_quinzenal_segundo_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_pagamento_quinzenal_segundo_value}}}")
  public Integer getDiaPagamentoQuinzenalSegundo() {
    return diaPagamentoQuinzenalSegundo;
  }
  public void setDiaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
  }

  
  /**
   * {{{credor_response_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_banco_value}}}")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * {{{credor_response_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_agencia_value}}}")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{credor_response_digito_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_digito_agencia_value}}}")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{credor_response_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_conta_corrente_value}}}")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{credor_response_digito_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_digito_conta_corrente_value}}}")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * {{{credor_response_credor_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_credor_banco_value}}}")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * {{{credor_response_percentual_rav_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_percentual_rav_value}}}")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * {{{credor_response_recebe_rav_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_recebe_rav_value}}}")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * {{{credor_response_percentual_multiplica_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_percentual_multiplica_value}}}")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * {{{credor_response_taxa_adm_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_taxa_adm_value}}}")
  public BigDecimal getTaxaAdministrativa() {
    return taxaAdministrativa;
  }
  public void setTaxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
  }

  
  /**
   * {{{credor_response_taxa_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_taxa_banco_value}}}")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * {{{credor_response_limite_rav_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_limite_rav_value}}}")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  
  /**
   * {{{credor_response_id_credor_rav_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_id_credor_rav_value}}}")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * {{{credor_response_periodicidade_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_periodicidade_value}}}")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * {{{credor_response_id_pessoa_juridica_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_id_pessoa_juridica_value}}}")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * {{{credor_response_flag_escritorio_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_flag_escritorio_cobranca_value}}}")
  public Boolean getFlagEscritorioCobranca() {
    return flagEscritorioCobranca;
  }
  public void setFlagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
  }

  
  /**
   * {{{credor_response_escritorio_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_escritorio_cobranca_value}}}")
  public EscritorioCobrancaDTO getEscritoriosCobranca() {
    return escritoriosCobranca;
  }
  public void setEscritoriosCobranca(EscritorioCobrancaDTO escritoriosCobranca) {
    this.escritoriosCobranca = escritoriosCobranca;
  }

  
  /**
   * {{{credor_response_telefone_escritorio_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_response_telefone_escritorio_cobranca_value}}}")
  public List<TelefoneEscritorioCobrancaDTO> getTelefonesEscritoriosCobranca() {
    return telefonesEscritoriosCobranca;
  }
  public void setTelefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nomeCredor: ").append(nomeCredor).append("\n");
    sb.append("  diaPagamentoSemanal: ").append(diaPagamentoSemanal).append("\n");
    sb.append("  diaPagamentoMensal: ").append(diaPagamentoMensal).append("\n");
    sb.append("  diaPagamentoDecendialPrimeiro: ").append(diaPagamentoDecendialPrimeiro).append("\n");
    sb.append("  diaPagamentoDecendialSegundo: ").append(diaPagamentoDecendialSegundo).append("\n");
    sb.append("  diaPagamentoDecendialTerceiro: ").append(diaPagamentoDecendialTerceiro).append("\n");
    sb.append("  diaPagamentoQuinzenalPrimeiro: ").append(diaPagamentoQuinzenalPrimeiro).append("\n");
    sb.append("  diaPagamentoQuinzenalSegundo: ").append(diaPagamentoQuinzenalSegundo).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoContaCorrente: ").append(digitoContaCorrente).append("\n");
    sb.append("  credorBanco: ").append(credorBanco).append("\n");
    sb.append("  percentualRAV: ").append(percentualRAV).append("\n");
    sb.append("  recebeRAV: ").append(recebeRAV).append("\n");
    sb.append("  percentualMultiplica: ").append(percentualMultiplica).append("\n");
    sb.append("  taxaAdministrativa: ").append(taxaAdministrativa).append("\n");
    sb.append("  taxaBanco: ").append(taxaBanco).append("\n");
    sb.append("  limiteRAV: ").append(limiteRAV).append("\n");
    sb.append("  idCredorRAV: ").append(idCredorRAV).append("\n");
    sb.append("  periodicidade: ").append(periodicidade).append("\n");
    sb.append("  idPessoaJuridica: ").append(idPessoaJuridica).append("\n");
    sb.append("  flagEscritorioCobranca: ").append(flagEscritorioCobranca).append("\n");
    sb.append("  escritoriosCobranca: ").append(escritoriosCobranca).append("\n");
    sb.append("  telefonesEscritoriosCobranca: ").append(telefonesEscritoriosCobranca).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

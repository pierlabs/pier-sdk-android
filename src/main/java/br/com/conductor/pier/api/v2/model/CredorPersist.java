package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefoneEscritorioCobrancaDTO;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CredorPersist  {
  
  @SerializedName("telefonesEscritoriosCobranca")
  private List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca = null;
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
  @SerializedName("prefixo")
  private String prefixo = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("nomeContato")
  private String nomeContato = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("nomeLogradouro")
  private String nomeLogradouro = null;
  @SerializedName("numeroEndereco")
  private Integer numeroEndereco = null;
  @SerializedName("complementoEndereco")
  private String complementoEndereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("flagSegundaViaAcordo")
  private Integer flagSegundaViaAcordo = null;
  @SerializedName("valorMinimoParcela")
  private BigDecimal valorMinimoParcela = null;
  @SerializedName("descontoMaximo")
  private BigDecimal descontoMaximo = null;

  
  /**
   * {{{credor_persist_telefones_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_telefones_value}}}")
  public List<TelefoneEscritorioCobrancaDTO> getTelefonesEscritoriosCobranca() {
    return telefonesEscritoriosCobranca;
  }
  public void setTelefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
  }

  
  /**
   * {{{credor_persist_nome_credor_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_nome_credor_value}}}")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * {{{credor_persist_pagamento_semanal_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_pagamento_semanal_value}}}")
  public Integer getDiaPagamentoSemanal() {
    return diaPagamentoSemanal;
  }
  public void setDiaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
  }

  
  /**
   * {{{credor_persist_pagamento_mensal_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_pagamento_mensal_value}}}")
  public Integer getDiaPagamentoMensal() {
    return diaPagamentoMensal;
  }
  public void setDiaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
  }

  
  /**
   * {{{credor_persist_pagamento_decendial_primeiro_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_pagamento_decendial_primeiro_value}}}")
  public Integer getDiaPagamentoDecendialPrimeiro() {
    return diaPagamentoDecendialPrimeiro;
  }
  public void setDiaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
  }

  
  /**
   * {{{credor_persist_pagamento_decendial_segundo_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_pagamento_decendial_segundo_value}}}")
  public Integer getDiaPagamentoDecendialSegundo() {
    return diaPagamentoDecendialSegundo;
  }
  public void setDiaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
  }

  
  /**
   * {{{credor_persist_pagamento_decendial_terceiro_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_pagamento_decendial_terceiro_value}}}")
  public Integer getDiaPagamentoDecendialTerceiro() {
    return diaPagamentoDecendialTerceiro;
  }
  public void setDiaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
  }

  
  /**
   * {{{credor_persist_pagamento_quinzenal_primeiro_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_pagamento_quinzenal_primeiro_value}}}")
  public Integer getDiaPagamentoQuinzenalPrimeiro() {
    return diaPagamentoQuinzenalPrimeiro;
  }
  public void setDiaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
  }

  
  /**
   * {{{credor_persist_pagamento_quinzenal_segundo_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_pagamento_quinzenal_segundo_value}}}")
  public Integer getDiaPagamentoQuinzenalSegundo() {
    return diaPagamentoQuinzenalSegundo;
  }
  public void setDiaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
  }

  
  /**
   * {{{credor_persist_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_banco_value}}}")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * {{{credor_persist_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_agencia_value}}}")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{credor_persist_digito_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_digito_agencia_value}}}")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{credor_persist_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_conta_corrente_value}}}")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{credor_persist_digito_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_digito_conta_corrente_value}}}")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * {{{credor_persist_credor_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_credor_banco_value}}}")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * {{{credor_persist_percentual_rav_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{credor_persist_percentual_rav_value}}}")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * {{{credor_persist_recebe_rav_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_recebe_rav_value}}}")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * {{{credor_persist_percentual_multiplica_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_percentual_multiplica_value}}}")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * {{{credor_persist_taxa_adm_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_taxa_adm_value}}}")
  public BigDecimal getTaxaAdministrativa() {
    return taxaAdministrativa;
  }
  public void setTaxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
  }

  
  /**
   * {{{credor_persist_taxa_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_taxa_banco_value}}}")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * {{{credor_persist_limite_rav_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_limite_rav_value}}}")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  
  /**
   * {{{credor_persist_id_credor_rav_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{credor_persist_id_credor_rav_value}}}")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * {{{credor_persist_periodicidade_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{credor_persist_periodicidade_value}}}")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * {{{credor_persist_id_pessoa_juridica_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{credor_persist_id_pessoa_juridica_value}}}")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * {{{credor_persist_flag_escritorio_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_flag_escritorio_cobranca_value}}}")
  public Boolean getFlagEscritorioCobranca() {
    return flagEscritorioCobranca;
  }
  public void setFlagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
  }

  
  /**
   * {{{credor_persist_prefixo_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_prefixo_value}}}")
  public String getPrefixo() {
    return prefixo;
  }
  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  
  /**
   * {{{credor_persist_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_ativo_value}}}")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{credor_persist_nome_contato_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_nome_contato_value}}}")
  public String getNomeContato() {
    return nomeContato;
  }
  public void setNomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  
  /**
   * {{{credor_persist_email_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{credor_persist_nome_logradouro_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_nome_logradouro_value}}}")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * {{{credor_persist_numero_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_numero_endereco_value}}}")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * {{{credor_persist_complemento_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_complemento_endereco_value}}}")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * {{{credor_persist_bairro_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_bairro_value}}}")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{credor_persist_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{credor_persist_cep_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_cep_value}}}")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{credor_persist_uf_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_uf_value}}}")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{credor_persist_responsavel_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_responsavel_value}}}")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * {{{credor_persist_flag_segunda_via_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_flag_segunda_via_acordo_value}}}")
  public Integer getFlagSegundaViaAcordo() {
    return flagSegundaViaAcordo;
  }
  public void setFlagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
  }

  
  /**
   * {{{credor_persist_valor_minimo_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_valor_minimo_parcela_value}}}")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * {{{credor_persist_desconto_maximo_value}}}
   **/
  @ApiModelProperty(value = "{{{credor_persist_desconto_maximo_value}}}")
  public BigDecimal getDescontoMaximo() {
    return descontoMaximo;
  }
  public void setDescontoMaximo(BigDecimal descontoMaximo) {
    this.descontoMaximo = descontoMaximo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredorPersist {\n");
    
    sb.append("  telefonesEscritoriosCobranca: ").append(telefonesEscritoriosCobranca).append("\n");
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
    sb.append("  prefixo: ").append(prefixo).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  nomeContato: ").append(nomeContato).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  complementoEndereco: ").append(complementoEndereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  flagSegundaViaAcordo: ").append(flagSegundaViaAcordo).append("\n");
    sb.append("  valorMinimoParcela: ").append(valorMinimoParcela).append("\n");
    sb.append("  descontoMaximo: ").append(descontoMaximo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

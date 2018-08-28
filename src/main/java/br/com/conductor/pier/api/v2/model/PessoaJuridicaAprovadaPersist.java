package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.EnderecoAprovadoPersistValue;
import br.com.conductor.pier.api.v2.model.ReferenciaComercialAprovadoPersistValue;
import br.com.conductor.pier.api.v2.model.SocioAprovadoPersistValue;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersistValue;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{pessoa_juridica_aprovada_persist_description}}}
 **/
@ApiModel(description = "{{{pessoa_juridica_aprovada_persist_description}}}")
public class PessoaJuridicaAprovadaPersist  {
  
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("dataAberturaEmpresa")
  private String dataAberturaEmpresa = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("numeroBanco")
  private Integer numeroBanco = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("canalEntrada")
  private String canalEntrada = null;
  @SerializedName("valorPontuacao")
  private Integer valorPontuacao = null;
  @SerializedName("telefones")
  private List<TelefonePessoaAprovadaPersistValue> telefones = null;
  @SerializedName("enderecos")
  private List<EnderecoAprovadoPersistValue> enderecos = null;
  @SerializedName("socios")
  private List<SocioAprovadoPersistValue> socios = null;
  @SerializedName("referenciasComerciais")
  private List<ReferenciaComercialAprovadoPersistValue> referenciasComerciais = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;

  
  /**
   * {{{pessoa_juridica_aprovada_persist_razao_social_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_razao_social_value}}}")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_nome_fantasia_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_nome_fantasia_value}}}")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_cnpj_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_cnpj_value}}}")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_inscricao_estadual_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_inscricao_estadual_value}}}")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_data_abertura_empresa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_data_abertura_empresa_value}}}")
  public String getDataAberturaEmpresa() {
    return dataAberturaEmpresa;
  }
  public void setDataAberturaEmpresa(String dataAberturaEmpresa) {
    this.dataAberturaEmpresa = dataAberturaEmpresa;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_id_origem_comercial_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_id_origem_comercial_value}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_id_produto_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_numero_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_numero_banco_value}}}")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_numero_agencia_value}}}")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_numero_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_numero_conta_corrente_value}}}")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_email_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_dia_vencimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_dia_vencimento_value}}}")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_nome_impresso_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_nome_impresso_value}}}")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_valor_renda_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_valor_renda_value}}}")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_canal_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_canal_entrada_value}}}")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_valor_pontuacao_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_valor_pontuacao_value}}}")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_telefones_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_telefones_value}}}")
  public List<TelefonePessoaAprovadaPersistValue> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersistValue> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_enderecos_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_enderecos_value}}}")
  public List<EnderecoAprovadoPersistValue> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoPersistValue> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_socios_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_socios_value}}}")
  public List<SocioAprovadoPersistValue> getSocios() {
    return socios;
  }
  public void setSocios(List<SocioAprovadoPersistValue> socios) {
    this.socios = socios;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_referencias_comerciais_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_aprovada_persist_referencias_comerciais_value}}}")
  public List<ReferenciaComercialAprovadoPersistValue> getReferenciasComerciais() {
    return referenciasComerciais;
  }
  public void setReferenciasComerciais(List<ReferenciaComercialAprovadoPersistValue> referenciasComerciais) {
    this.referenciasComerciais = referenciasComerciais;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_limite_global_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_limite_global_value}}}")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_limite_maximo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_limite_maximo_value}}}")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{pessoa_juridica_aprovada_persist_limite_parcelas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_aprovada_persist_limite_parcelas_value}}}")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaAprovadaPersist {\n");
    
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  dataAberturaEmpresa: ").append(dataAberturaEmpresa).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  numeroBanco: ").append(numeroBanco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  enderecos: ").append(enderecos).append("\n");
    sb.append("  socios: ").append(socios).append("\n");
    sb.append("  referenciasComerciais: ").append(referenciasComerciais).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

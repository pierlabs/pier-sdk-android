package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.EnderecoAprovadoPersistValue;
import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersistValue;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{pessoa_fisica_aprovada_persist_description}}}
 **/
@ApiModel(description = "{{{pessoa_fisica_aprovada_persist_description}}}")
public class PessoaFisicaAprovadaPersistValue  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeMae")
  private String nomeMae = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoExpedidorIdentidade")
  private String orgaoExpedidorIdentidade = null;
  @SerializedName("unidadeFederativaIdentidade")
  private String unidadeFederativaIdentidade = null;
  @SerializedName("dataEmissaoIdentidade")
  private String dataEmissaoIdentidade = null;
  @SerializedName("idEstadoCivil")
  private Long idEstadoCivil = null;
  @SerializedName("idProfissao")
  private String idProfissao = null;
  @SerializedName("idNaturezaOcupacao")
  private Long idNaturezaOcupacao = null;
  @SerializedName("idNacionalidade")
  private Long idNacionalidade = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
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
  @SerializedName("nomeEmpresa")
  private String nomeEmpresa = null;
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
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("limiteMaximo")
  private BigDecimal limiteMaximo = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;

  
  /**
   * {{{pessoa_fisica_aprovada_persist_nome_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_nome_mae_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_nome_mae_value}}}")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_data_nascimento_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_data_nascimento_value}}}")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_sexo_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_sexo_value}}}")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_cpf_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_numero_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_numero_identidade_value}}}")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_orgao_expedidor_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_orgao_expedidor_identidade_value}}}")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_unidade_federativa_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_unidade_federativa_identidade_value}}}")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_data_emissao_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_data_emissao_identidade_value}}}")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_estado_civil_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_id_estado_civil_value}}}")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_profissao_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_id_profissao_value}}}")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_natureza_ocupacao_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_id_natureza_ocupacao_value}}}")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_nacionalidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_id_nacionalidade_value}}}")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_origem_comercial_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_id_origem_comercial_value}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_id_produto_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_numero_agencia_value}}}")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_numero_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_numero_conta_corrente_value}}}")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_email_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_dia_vencimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_dia_vencimento_value}}}")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_nome_impresso_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_nome_impresso_value}}}")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_nome_empresa_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_nome_empresa_value}}}")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_valor_renda_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_valor_renda_value}}}")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_canal_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_canal_entrada_value}}}")
  public String getCanalEntrada() {
    return canalEntrada;
  }
  public void setCanalEntrada(String canalEntrada) {
    this.canalEntrada = canalEntrada;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_valor_pontuacao_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_valor_pontuacao_value}}}")
  public Integer getValorPontuacao() {
    return valorPontuacao;
  }
  public void setValorPontuacao(Integer valorPontuacao) {
    this.valorPontuacao = valorPontuacao;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_telefones_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_telefones_value}}}")
  public List<TelefonePessoaAprovadaPersistValue> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersistValue> telefones) {
    this.telefones = telefones;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_enderecos_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_enderecos_value}}}")
  public List<EnderecoAprovadoPersistValue> getEnderecos() {
    return enderecos;
  }
  public void setEnderecos(List<EnderecoAprovadoPersistValue> enderecos) {
    this.enderecos = enderecos;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_limite_global_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_limite_global_value}}}")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_limite_maximo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_limite_maximo_value}}}")
  public BigDecimal getLimiteMaximo() {
    return limiteMaximo;
  }
  public void setLimiteMaximo(BigDecimal limiteMaximo) {
    this.limiteMaximo = limiteMaximo;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_limite_parcelas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_fisica_aprovada_persist_limite_parcelas_value}}}")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * {{{pessoa_fisica_aprovada_persist_limite_consignado_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_fisica_aprovada_persist_limite_consignado_value}}}")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaFisicaAprovadaPersistValue {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeMae: ").append(nomeMae).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  idEstadoCivil: ").append(idEstadoCivil).append("\n");
    sb.append("  idProfissao: ").append(idProfissao).append("\n");
    sb.append("  idNaturezaOcupacao: ").append(idNaturezaOcupacao).append("\n");
    sb.append("  idNacionalidade: ").append(idNacionalidade).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  nomeEmpresa: ").append(nomeEmpresa).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  canalEntrada: ").append(canalEntrada).append("\n");
    sb.append("  valorPontuacao: ").append(valorPontuacao).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("  enderecos: ").append(enderecos).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteMaximo: ").append(limiteMaximo).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

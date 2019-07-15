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
   * Telefones do credor
   **/
  @ApiModelProperty(value = "Telefones do credor")
  public List<TelefoneEscritorioCobrancaDTO> getTelefonesEscritoriosCobranca() {
    return telefonesEscritoriosCobranca;
  }
  public void setTelefonesEscritoriosCobranca(List<TelefoneEscritorioCobrancaDTO> telefonesEscritoriosCobranca) {
    this.telefonesEscritoriosCobranca = telefonesEscritoriosCobranca;
  }

  
  /**
   * Nome do credor
   **/
  @ApiModelProperty(value = "Nome do credor")
  public String getNomeCredor() {
    return nomeCredor;
  }
  public void setNomeCredor(String nomeCredor) {
    this.nomeCredor = nomeCredor;
  }

  
  /**
   * Dia do pagamento caso seja semanal
   **/
  @ApiModelProperty(value = "Dia do pagamento caso seja semanal")
  public Integer getDiaPagamentoSemanal() {
    return diaPagamentoSemanal;
  }
  public void setDiaPagamentoSemanal(Integer diaPagamentoSemanal) {
    this.diaPagamentoSemanal = diaPagamentoSemanal;
  }

  
  /**
   * Dia do pagamento caso seja mensal
   **/
  @ApiModelProperty(value = "Dia do pagamento caso seja mensal")
  public Integer getDiaPagamentoMensal() {
    return diaPagamentoMensal;
  }
  public void setDiaPagamentoMensal(Integer diaPagamentoMensal) {
    this.diaPagamentoMensal = diaPagamentoMensal;
  }

  
  /**
   * Dia do primeiro pagamento caso seja decendial
   **/
  @ApiModelProperty(value = "Dia do primeiro pagamento caso seja decendial")
  public Integer getDiaPagamentoDecendialPrimeiro() {
    return diaPagamentoDecendialPrimeiro;
  }
  public void setDiaPagamentoDecendialPrimeiro(Integer diaPagamentoDecendialPrimeiro) {
    this.diaPagamentoDecendialPrimeiro = diaPagamentoDecendialPrimeiro;
  }

  
  /**
   * Dia do segundo pagamento caso seja decendial
   **/
  @ApiModelProperty(value = "Dia do segundo pagamento caso seja decendial")
  public Integer getDiaPagamentoDecendialSegundo() {
    return diaPagamentoDecendialSegundo;
  }
  public void setDiaPagamentoDecendialSegundo(Integer diaPagamentoDecendialSegundo) {
    this.diaPagamentoDecendialSegundo = diaPagamentoDecendialSegundo;
  }

  
  /**
   * Dia do terceiro pagamento caso seja decendial
   **/
  @ApiModelProperty(value = "Dia do terceiro pagamento caso seja decendial")
  public Integer getDiaPagamentoDecendialTerceiro() {
    return diaPagamentoDecendialTerceiro;
  }
  public void setDiaPagamentoDecendialTerceiro(Integer diaPagamentoDecendialTerceiro) {
    this.diaPagamentoDecendialTerceiro = diaPagamentoDecendialTerceiro;
  }

  
  /**
   * Dia do primeiro pagamento caso seja quinzenal
   **/
  @ApiModelProperty(value = "Dia do primeiro pagamento caso seja quinzenal")
  public Integer getDiaPagamentoQuinzenalPrimeiro() {
    return diaPagamentoQuinzenalPrimeiro;
  }
  public void setDiaPagamentoQuinzenalPrimeiro(Integer diaPagamentoQuinzenalPrimeiro) {
    this.diaPagamentoQuinzenalPrimeiro = diaPagamentoQuinzenalPrimeiro;
  }

  
  /**
   * Dia do segundo pagamento caso seja quinzenal
   **/
  @ApiModelProperty(value = "Dia do segundo pagamento caso seja quinzenal")
  public Integer getDiaPagamentoQuinzenalSegundo() {
    return diaPagamentoQuinzenalSegundo;
  }
  public void setDiaPagamentoQuinzenalSegundo(Integer diaPagamentoQuinzenalSegundo) {
    this.diaPagamentoQuinzenalSegundo = diaPagamentoQuinzenalSegundo;
  }

  
  /**
   * Banco do credor
   **/
  @ApiModelProperty(value = "Banco do credor")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * Ag\u00EAncia do credor
   **/
  @ApiModelProperty(value = "Ag\u00EAncia do credor")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00EDgito da ag\u00EAncia
   **/
  @ApiModelProperty(value = "D\u00EDgito da ag\u00EAncia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Conta corrente do credor
   **/
  @ApiModelProperty(value = "Conta corrente do credor")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00EDgito da conta corrente
   **/
  @ApiModelProperty(value = "D\u00EDgito da conta corrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  
  /**
   * Banco credor
   **/
  @ApiModelProperty(value = "Banco credor")
  public Boolean getCredorBanco() {
    return credorBanco;
  }
  public void setCredorBanco(Boolean credorBanco) {
    this.credorBanco = credorBanco;
  }

  
  /**
   * Percentual RAV
   **/
  @ApiModelProperty(required = true, value = "Percentual RAV")
  public BigDecimal getPercentualRAV() {
    return percentualRAV;
  }
  public void setPercentualRAV(BigDecimal percentualRAV) {
    this.percentualRAV = percentualRAV;
  }

  
  /**
   * Identifica se o credor tem um RAV associado, e seu tipo
   **/
  @ApiModelProperty(value = "Identifica se o credor tem um RAV associado, e seu tipo")
  public RecebeRAVEnum getRecebeRAV() {
    return recebeRAV;
  }
  public void setRecebeRAV(RecebeRAVEnum recebeRAV) {
    this.recebeRAV = recebeRAV;
  }

  
  /**
   * Percentual de multiplica\u00E7\u00E3o utilizado para gerar taxa de desconto do RAV
   **/
  @ApiModelProperty(value = "Percentual de multiplica\u00E7\u00E3o utilizado para gerar taxa de desconto do RAV")
  public BigDecimal getPercentualMultiplica() {
    return percentualMultiplica;
  }
  public void setPercentualMultiplica(BigDecimal percentualMultiplica) {
    this.percentualMultiplica = percentualMultiplica;
  }

  
  /**
   * Taxa administrativa usada para gerar o valor do RAV
   **/
  @ApiModelProperty(value = "Taxa administrativa usada para gerar o valor do RAV")
  public BigDecimal getTaxaAdministrativa() {
    return taxaAdministrativa;
  }
  public void setTaxaAdministrativa(BigDecimal taxaAdministrativa) {
    this.taxaAdministrativa = taxaAdministrativa;
  }

  
  /**
   * Taxa do banco RAV
   **/
  @ApiModelProperty(value = "Taxa do banco RAV")
  public BigDecimal getTaxaBanco() {
    return taxaBanco;
  }
  public void setTaxaBanco(BigDecimal taxaBanco) {
    this.taxaBanco = taxaBanco;
  }

  
  /**
   * Valor limite do RAV
   **/
  @ApiModelProperty(value = "Valor limite do RAV")
  public BigDecimal getLimiteRAV() {
    return limiteRAV;
  }
  public void setLimiteRAV(BigDecimal limiteRAV) {
    this.limiteRAV = limiteRAV;
  }

  
  /**
   * Identificador da RAV do credor
   **/
  @ApiModelProperty(required = true, value = "Identificador da RAV do credor")
  public Long getIdCredorRAV() {
    return idCredorRAV;
  }
  public void setIdCredorRAV(Long idCredorRAV) {
    this.idCredorRAV = idCredorRAV;
  }

  
  /**
   * Periodicidade do pagamento
   **/
  @ApiModelProperty(required = true, value = "Periodicidade do pagamento")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Identificador da pessoa jur\u00EDdica associada ao credor
   **/
  @ApiModelProperty(required = true, value = "Identificador da pessoa jur\u00EDdica associada ao credor")
  public Long getIdPessoaJuridica() {
    return idPessoaJuridica;
  }
  public void setIdPessoaJuridica(Long idPessoaJuridica) {
    this.idPessoaJuridica = idPessoaJuridica;
  }

  
  /**
   * Flag para controle interno
   **/
  @ApiModelProperty(value = "Flag para controle interno")
  public Boolean getFlagEscritorioCobranca() {
    return flagEscritorioCobranca;
  }
  public void setFlagEscritorioCobranca(Boolean flagEscritorioCobranca) {
    this.flagEscritorioCobranca = flagEscritorioCobranca;
  }

  
  /**
   * Prefixo utilizado pelo escrit\u00F3rio de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Prefixo utilizado pelo escrit\u00F3rio de cobran\u00E7a")
  public String getPrefixo() {
    return prefixo;
  }
  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  
  /**
   * Identifica se o escrit\u00F3rio de cobran\u00E7a est\u00E1 ativo
   **/
  @ApiModelProperty(value = "Identifica se o escrit\u00F3rio de cobran\u00E7a est\u00E1 ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Nome para contato no escrit\u00F3rio de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Nome para contato no escrit\u00F3rio de cobran\u00E7a")
  public String getNomeContato() {
    return nomeContato;
  }
  public void setNomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  
  /**
   * Email do contato no escrit\u00F3rio de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Email do contato no escrit\u00F3rio de cobran\u00E7a")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Logradouro do credor
   **/
  @ApiModelProperty(value = "Logradouro do credor")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * N\u00FAmero do endere\u00E7o do credor
   **/
  @ApiModelProperty(value = "N\u00FAmero do endere\u00E7o do credor")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Complemento do endere\u00E7o do credor
   **/
  @ApiModelProperty(value = "Complemento do endere\u00E7o do credor")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * Bairro do endere\u00E7o do credor
   **/
  @ApiModelProperty(value = "Bairro do endere\u00E7o do credor")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Cidade do endere\u00E7o do credor
   **/
  @ApiModelProperty(value = "Cidade do endere\u00E7o do credor")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * CEP do endere\u00E7o do credor
   **/
  @ApiModelProperty(value = "CEP do endere\u00E7o do credor")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * UF do endere\u00E7o do credor
   **/
  @ApiModelProperty(value = "UF do endere\u00E7o do credor")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Respons\u00E1vel pelo credor
   **/
  @ApiModelProperty(value = "Respons\u00E1vel pelo credor")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Identifica se h\u00E1 uma segunda via do acordo firmado
   **/
  @ApiModelProperty(value = "Identifica se h\u00E1 uma segunda via do acordo firmado")
  public Integer getFlagSegundaViaAcordo() {
    return flagSegundaViaAcordo;
  }
  public void setFlagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
  }

  
  /**
   * Valor m\u00EDnimo da parcela cobrado pelo escrit\u00F3rio de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Valor m\u00EDnimo da parcela cobrado pelo escrit\u00F3rio de cobran\u00E7a")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * Desconto m\u00E1ximo estabelecido pelo escrit\u00F3rio de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Desconto m\u00E1ximo estabelecido pelo escrit\u00F3rio de cobran\u00E7a")
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

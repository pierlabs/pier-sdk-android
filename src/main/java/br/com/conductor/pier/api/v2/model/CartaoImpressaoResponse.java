package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Cart\u00E3o para Impresso
 **/
@ApiModel(description = "Objeto Cart\u00E3o para Impresso")
public class CartaoImpressaoResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idBandeira")
  private Long idBandeira = null;
  @SerializedName("idTipoCartao")
  private Long idTipoCartao = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("cvv2")
  private String cvv2 = null;
  @SerializedName("dataGeracao")
  private String dataGeracao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("nomeOrigemComercial")
  private String nomeOrigemComercial = null;
  @SerializedName("nomeEmpresa")
  private String nomeEmpresa = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorente")
  private String numeroContaCorente = null;
  @SerializedName("nomeEmpresaBeneficio")
  private String nomeEmpresaBeneficio = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
  @SerializedName("nomeEmpregador")
  private String nomeEmpregador = null;
  @SerializedName("trilha1")
  private String trilha1 = null;
  @SerializedName("trilha2")
  private String trilha2 = null;
  @SerializedName("trilhaCVV1")
  private String trilhaCVV1 = null;
  @SerializedName("trilhaCVV2")
  private String trilhaCVV2 = null;
  @SerializedName("flagVirtual")
  private Integer flagVirtual = null;
  @SerializedName("numeroCartaoHash")
  private Long numeroCartaoHash = null;

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id) a qual o cart\u00E3o gerado pertence.
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id) a qual o cart\u00E3o gerado pertence.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) portadora do cart\u00E3o gerado.
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) portadora do cart\u00E3o gerado.")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id) que foi gerado.
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id) que foi gerado.")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Bandeira (id) a qual o Cart\u00E3o pertence, quando bandeirado.
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o da Bandeira (id) a qual o Cart\u00E3o pertence, quando bandeirado.")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Cart\u00E3o (id) atribu\u00EDdo ao Cart\u00E3o.
   **/
  @ApiModelProperty(value = "Apresenta o C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Cart\u00E3o (id) atribu\u00EDdo ao Cart\u00E3o.")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * Apresenta o n\u00FAmero do cart\u00E3o.
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero do cart\u00E3o.")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Apresenta o nome do Portador do Cart\u00E3o.
   **/
  @ApiModelProperty(value = "Apresenta o nome do Portador do Cart\u00E3o.")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * Apresenta o n\u00FAmero do CVV a ser impresso no Cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero do CVV a ser impresso no Cart\u00E3o")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * Apresenta a data de emiss\u00E3o do Cart\u00E3o.
   **/
  @ApiModelProperty(value = "Apresenta a data de emiss\u00E3o do Cart\u00E3o.")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta a data de Validade do Cart\u00E3o.
   **/
  @ApiModelProperty(value = "Apresenta a data de Validade do Cart\u00E3o.")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Apresenta o nome da Origem Comercial que realizou o cadastro do Titular da Conta a qual o Cart\u00E3o pertence.
   **/
  @ApiModelProperty(value = "Apresenta o nome da Origem Comercial que realizou o cadastro do Titular da Conta a qual o Cart\u00E3o pertence.")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * Apresenta o nome da Empresa (Pessoa Jur\u00EDdica) titular do Cart\u00E3o, quando aplic\u00E1vel.
   **/
  @ApiModelProperty(value = "Apresenta o nome da Empresa (Pessoa Jur\u00EDdica) titular do Cart\u00E3o, quando aplic\u00E1vel.")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * Apresenta o n\u00FAmero da Ag\u00EAncia a ser impresso no Cart\u00E3o, quando aplic\u00E1vel.
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero da Ag\u00EAncia a ser impresso no Cart\u00E3o, quando aplic\u00E1vel.")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Apresenta o n\u00FAmero da Conta Corrente a ser impresso no Cart\u00E3o, quando aplic\u00E1vel.
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero da Conta Corrente a ser impresso no Cart\u00E3o, quando aplic\u00E1vel.")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   * Apresenta o nome da Pessoa F\u00EDsica ou Jur\u00EDdica que contratou servi\u00E7os de benef\u00EDcio para o portador do cart\u00E3o, quando aplic\u00E1vel.
   **/
  @ApiModelProperty(value = "Apresenta o nome da Pessoa F\u00EDsica ou Jur\u00EDdica que contratou servi\u00E7os de benef\u00EDcio para o portador do cart\u00E3o, quando aplic\u00E1vel.")
  public String getNomeEmpresaBeneficio() {
    return nomeEmpresaBeneficio;
  }
  public void setNomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
  }

  
  /**
   * Apresenta o CPF do Portador do Cart\u00E3o.
   **/
  @ApiModelProperty(value = "Apresenta o CPF do Portador do Cart\u00E3o.")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00E3o, sendo: ('T': Titular, 'A': Adicional).
   **/
  @ApiModelProperty(value = "Apresenta o tipo do Portador do cart\u00E3o, sendo: ('T': Titular, 'A': Adicional).")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Apresenta o nome da Pessoa F\u00EDsica ou Jur\u00EDdica a ser impresso no cart\u00E3o, quando aplic\u00E1vel.
   **/
  @ApiModelProperty(value = "Apresenta o nome da Pessoa F\u00EDsica ou Jur\u00EDdica a ser impresso no cart\u00E3o, quando aplic\u00E1vel.")
  public String getNomeEmpregador() {
    return nomeEmpregador;
  }
  public void setNomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
  }

  
  /**
   * Apresenta os dados da Trilha1, seguindo as regras de trilha do emissor.
   **/
  @ApiModelProperty(value = "Apresenta os dados da Trilha1, seguindo as regras de trilha do emissor.")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * Apresenta os dados da Trilha2, seguindo as regras de trilha do emissor.
   **/
  @ApiModelProperty(value = "Apresenta os dados da Trilha2, seguindo as regras de trilha do emissor.")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * Apresenta os dados da TrilhaCVV01, seguindo as regras de trilha do emissor.
   **/
  @ApiModelProperty(value = "Apresenta os dados da TrilhaCVV01, seguindo as regras de trilha do emissor.")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * Apresenta os dados da TrilhaCVV02, seguindo as regras de trilha do emissor.
   **/
  @ApiModelProperty(value = "Apresenta os dados da TrilhaCVV02, seguindo as regras de trilha do emissor.")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  
  /**
   * Apresenta o status que informa se o cart\u00E3o \u00E9 virtual 
   **/
  @ApiModelProperty(value = "Apresenta o status que informa se o cart\u00E3o \u00E9 virtual ")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Apresenta o numero da hash do cart\u00E3o 
   **/
  @ApiModelProperty(value = "Apresenta o numero da hash do cart\u00E3o ")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoImpressaoResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idBandeira: ").append(idBandeira).append("\n");
    sb.append("  idTipoCartao: ").append(idTipoCartao).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  cvv2: ").append(cvv2).append("\n");
    sb.append("  dataGeracao: ").append(dataGeracao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  nomeOrigemComercial: ").append(nomeOrigemComercial).append("\n");
    sb.append("  nomeEmpresa: ").append(nomeEmpresa).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorente: ").append(numeroContaCorente).append("\n");
    sb.append("  nomeEmpresaBeneficio: ").append(nomeEmpresaBeneficio).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  nomeEmpregador: ").append(nomeEmpregador).append("\n");
    sb.append("  trilha1: ").append(trilha1).append("\n");
    sb.append("  trilha2: ").append(trilha2).append("\n");
    sb.append("  trilhaCVV1: ").append(trilhaCVV1).append("\n");
    sb.append("  trilhaCVV2: ").append(trilhaCVV2).append("\n");
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  numeroCartaoHash: ").append(numeroCartaoHash).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Cart\u00E3o para Impresso
 **/
@ApiModel(description = "Objeto Cart\u00E3o para Impresso")
public class DadosCartaoImpressaoResponse  {
  
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
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
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
  @SerializedName("nomeBandeira")
  private String nomeBandeira = null;
  @SerializedName("flagTitular")
  private Integer flagTitular = null;
  @SerializedName("sequencialCartao")
  private Integer sequencialCartao = null;
  @SerializedName("idStatus")
  private Long idStatus = null;
  @SerializedName("descricaoStatusCartao")
  private String descricaoStatusCartao = null;
  @SerializedName("dataStatus")
  private String dataStatus = null;
  @SerializedName("idEstagio")
  private Long idEstagio = null;
  @SerializedName("descricaoEstagio")
  private String descricaoEstagio = null;
  @SerializedName("dataEstagio")
  private String dataEstagio = null;
  @SerializedName("numeroBin")
  private String numeroBin = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("descricaoProduto")
  private String descricaoProduto = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("descricaoStatusConta")
  private Long descricaoStatusConta = null;
  @SerializedName("dataEmbossing")
  private String dataEmbossing = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;
  @SerializedName("nomePessoa")
  private String nomePessoa = null;
  @SerializedName("tipoPessoa")
  private String tipoPessoa = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("idEndereco")
  private Long idEndereco = null;
  @SerializedName("idTipoEndereco")
  private Long idTipoEndereco = null;
  @SerializedName("descricaoTipoEndereco")
  private String descricaoTipoEndereco = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("logradouro")
  private String logradouro = null;
  @SerializedName("numeroEndereco")
  private String numeroEndereco = null;
  @SerializedName("complementoEndereco")
  private String complementoEndereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("pais")
  private String pais = null;
  @SerializedName("senhaCriptografada")
  private String senhaCriptografada = null;
  @SerializedName("icvv")
  private String icvv = null;
  @SerializedName("idStatusImpressao")
  private Long idStatusImpressao = null;

  
  /**
   * O C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id) a qual o cart\u00E3o gerado pertence
   **/
  @ApiModelProperty(value = "O C\u00F3digo de Identifica\u00E7\u00E3o da Conta (id) a qual o cart\u00E3o gerado pertence")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * O C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) portadora do cart\u00E3o gerado
   **/
  @ApiModelProperty(value = "O C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa (id) portadora do cart\u00E3o gerado")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * O C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id) que foi gerado
   **/
  @ApiModelProperty(value = "O C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id) que foi gerado")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * O C\u00F3digo de Identifica\u00E7\u00E3o da Bandeira (id) a qual o Cart\u00E3o pertence, quando bandeirado
   **/
  @ApiModelProperty(value = "O C\u00F3digo de Identifica\u00E7\u00E3o da Bandeira (id) a qual o Cart\u00E3o pertence, quando bandeirado")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * O C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Cart\u00E3o (id) atribu\u00EDdo ao Cart\u00E3o
   **/
  @ApiModelProperty(value = "O C\u00F3digo de Identifica\u00E7\u00E3o do Tipo do Cart\u00E3o (id) atribu\u00EDdo ao Cart\u00E3o")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * O n\u00FAmero do cart\u00E3o
   **/
  @ApiModelProperty(value = "O n\u00FAmero do cart\u00E3o")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * O nome do Portador do Cart\u00E3o
   **/
  @ApiModelProperty(value = "O nome do Portador do Cart\u00E3o")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * O n\u00FAmero do CVV a ser impresso no Cart\u00E3o
   **/
  @ApiModelProperty(value = "O n\u00FAmero do CVV a ser impresso no Cart\u00E3o")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * Apresenta a data de emiss\u00E3o do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta a data de emiss\u00E3o do Cart\u00E3o")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta a data de Validade do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta a data de Validade do Cart\u00E3o")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * O CPF do Portador do Cart\u00E3o
   **/
  @ApiModelProperty(value = "O CPF do Portador do Cart\u00E3o")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * O tipo do Portador do cart\u00E3o, sendo: ('T': Titular, 'A': Adicional)
   **/
  @ApiModelProperty(value = "O tipo do Portador do cart\u00E3o, sendo: ('T': Titular, 'A': Adicional)")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Os dados da Trilha1, seguindo as regras de trilha do emissor
   **/
  @ApiModelProperty(value = "Os dados da Trilha1, seguindo as regras de trilha do emissor")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * Os dados da Trilha2, seguindo as regras de trilha do emissor
   **/
  @ApiModelProperty(value = "Os dados da Trilha2, seguindo as regras de trilha do emissor")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * Os dados da TrilhaCVV01, seguindo as regras de trilha do emissor
   **/
  @ApiModelProperty(value = "Os dados da TrilhaCVV01, seguindo as regras de trilha do emissor")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * Os dados da TrilhaCVV02, seguindo as regras de trilha do emissor
   **/
  @ApiModelProperty(value = "Os dados da TrilhaCVV02, seguindo as regras de trilha do emissor")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  
  /**
   * O status que informa se o cart\u00E3o \u00E9 virtual
   **/
  @ApiModelProperty(value = "O status que informa se o cart\u00E3o \u00E9 virtual")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * Nome da Bandeira
   **/
  @ApiModelProperty(value = "Nome da Bandeira")
  public String getNomeBandeira() {
    return nomeBandeira;
  }
  public void setNomeBandeira(String nomeBandeira) {
    this.nomeBandeira = nomeBandeira;
  }

  
  /**
   * Flag Indicativo de Titularidade da Conta
   **/
  @ApiModelProperty(value = "Flag Indicativo de Titularidade da Conta")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * C\u00F3digo Sequencial do Cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo Sequencial do Cart\u00E3o")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * Identificador do Status do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do Status do Cart\u00E3o")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * Descri\u00E7\u00E3o do Status do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Status do Cart\u00E3o")
  public String getDescricaoStatusCartao() {
    return descricaoStatusCartao;
  }
  public void setDescricaoStatusCartao(String descricaoStatusCartao) {
    this.descricaoStatusCartao = descricaoStatusCartao;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * Identificador do Est\u00E1gio do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do Est\u00E1gio do Cart\u00E3o")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * Descri\u00E7\u00E3o do Estagio do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Estagio do Cart\u00E3o")
  public String getDescricaoEstagio() {
    return descricaoEstagio;
  }
  public void setDescricaoEstagio(String descricaoEstagio) {
    this.descricaoEstagio = descricaoEstagio;
  }

  
  /**
   * Apresenta a data em que o idEstagioCartao atual do cart\u00E3o fora aplicado, quando houver
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idEstagioCartao atual do cart\u00E3o fora aplicado, quando houver")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * N\u00FAmero do Bin do Cart\u00E3o
   **/
  @ApiModelProperty(value = "N\u00FAmero do Bin do Cart\u00E3o")
  public String getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(String numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * Identificador do Produto Associado a Conta
   **/
  @ApiModelProperty(value = "Identificador do Produto Associado a Conta")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Descri\u00E7\u00E3o do produto
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do produto")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * Identificador do Status da Conta
   **/
  @ApiModelProperty(value = "Identificador do Status da Conta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Descri\u00E7\u00E3o do status da conta
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status da conta")
  public Long getDescricaoStatusConta() {
    return descricaoStatusConta;
  }
  public void setDescricaoStatusConta(Long descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
  }

  
  /**
   * Data que o cart\u00E3o foi embossado
   **/
  @ApiModelProperty(value = "Data que o cart\u00E3o foi embossado")
  public String getDataEmbossing() {
    return dataEmbossing;
  }
  public void setDataEmbossing(String dataEmbossing) {
    this.dataEmbossing = dataEmbossing;
  }

  
  /**
   * C\u00F3digo de desbloqueio do cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de desbloqueio do cart\u00E3o")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * O 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00E3o Social (Nome Empresarial)'
   **/
  @ApiModelProperty(value = "O 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00E3o Social (Nome Empresarial)'")
  public String getNomePessoa() {
    return nomePessoa;
  }
  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo da Pessoa, sendo: ('PF': Pessoa F\u00EDsica), ('PJ': Pessoa Jur\u00EDdica)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo da Pessoa, sendo: ('PF': Pessoa F\u00EDsica), ('PJ': Pessoa Jur\u00EDdica)")
  public String getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(String tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  
  /**
   * Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ
   **/
  @ApiModelProperty(value = "Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Identificador do Endere\u00E7o do titular do cart\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do Endere\u00E7o do titular do cart\u00E3o")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Tipo Endere\u00E7o (id)")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * Descri\u00E7\u00E3o do Tipo de Endere\u00E7o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Tipo de Endere\u00E7o")
  public String getDescricaoTipoEndereco() {
    return descricaoTipoEndereco;
  }
  public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
    this.descricaoTipoEndereco = descricaoTipoEndereco;
  }

  
  /**
   * O C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'
   **/
  @ApiModelProperty(value = "O C\u00F3digo de Endere\u00E7amento Postal (CEP) no formaro '58800000'")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Nome do Logradouro
   **/
  @ApiModelProperty(value = "Nome do Logradouro")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * N\u00FAmero do endere\u00E7o
   **/
  @ApiModelProperty(value = "N\u00FAmero do endere\u00E7o")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Descri\u00E7oes complementares referente ao endere\u00E7o
   **/
  @ApiModelProperty(value = "Descri\u00E7oes complementares referente ao endere\u00E7o")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * Nome do bairro
   **/
  @ApiModelProperty(value = "Nome do bairro")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Nome do cidade
   **/
  @ApiModelProperty(value = "Nome do cidade")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Unidade federativa
   **/
  @ApiModelProperty(value = "Unidade federativa")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Nome do pa\u00EDs
   **/
  @ApiModelProperty(value = "Nome do pa\u00EDs")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Senha Criptografada
   **/
  @ApiModelProperty(value = "Senha Criptografada")
  public String getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(String senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * O n\u00FAmero do ICVV do Cart\u00E3o
   **/
  @ApiModelProperty(value = "O n\u00FAmero do ICVV do Cart\u00E3o")
  public String getIcvv() {
    return icvv;
  }
  public void setIcvv(String icvv) {
    this.icvv = icvv;
  }

  
  /**
   * Apresenta o identificador do status de impress\u00E3o do cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o identificador do status de impress\u00E3o do cart\u00E3o")
  public Long getIdStatusImpressao() {
    return idStatusImpressao;
  }
  public void setIdStatusImpressao(Long idStatusImpressao) {
    this.idStatusImpressao = idStatusImpressao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCartaoImpressaoResponse {\n");
    
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
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  trilha1: ").append(trilha1).append("\n");
    sb.append("  trilha2: ").append(trilha2).append("\n");
    sb.append("  trilhaCVV1: ").append(trilhaCVV1).append("\n");
    sb.append("  trilhaCVV2: ").append(trilhaCVV2).append("\n");
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  nomeBandeira: ").append(nomeBandeira).append("\n");
    sb.append("  flagTitular: ").append(flagTitular).append("\n");
    sb.append("  sequencialCartao: ").append(sequencialCartao).append("\n");
    sb.append("  idStatus: ").append(idStatus).append("\n");
    sb.append("  descricaoStatusCartao: ").append(descricaoStatusCartao).append("\n");
    sb.append("  dataStatus: ").append(dataStatus).append("\n");
    sb.append("  idEstagio: ").append(idEstagio).append("\n");
    sb.append("  descricaoEstagio: ").append(descricaoEstagio).append("\n");
    sb.append("  dataEstagio: ").append(dataEstagio).append("\n");
    sb.append("  numeroBin: ").append(numeroBin).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  descricaoProduto: ").append(descricaoProduto).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  descricaoStatusConta: ").append(descricaoStatusConta).append("\n");
    sb.append("  dataEmbossing: ").append(dataEmbossing).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("  nomePessoa: ").append(nomePessoa).append("\n");
    sb.append("  tipoPessoa: ").append(tipoPessoa).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  idEndereco: ").append(idEndereco).append("\n");
    sb.append("  idTipoEndereco: ").append(idTipoEndereco).append("\n");
    sb.append("  descricaoTipoEndereco: ").append(descricaoTipoEndereco).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  logradouro: ").append(logradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  complementoEndereco: ").append(complementoEndereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  pais: ").append(pais).append("\n");
    sb.append("  senhaCriptografada: ").append(senhaCriptografada).append("\n");
    sb.append("  icvv: ").append(icvv).append("\n");
    sb.append("  idStatusImpressao: ").append(idStatusImpressao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

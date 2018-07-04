package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{dados_cartao_impressao_response_description}}}
 **/
@ApiModel(description = "{{{dados_cartao_impressao_response_description}}}")
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
   * {{{dados_cartao_impressao_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_bandeira_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_bandeira_value}}}")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_tipo_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_tipo_cartao_value}}}")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_nome_plastico_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_nome_plastico_value}}}")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{dados_cartao_impressao_response_cvv2_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_cvv2_value}}}")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_geracao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_data_geracao_value}}}")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{dados_cartao_impressao_response_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{dados_cartao_impressao_response_tipo_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_tipo_portador_value}}}")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * {{{dados_cartao_impressao_response_trilha1_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_trilha1_value}}}")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * {{{dados_cartao_impressao_response_trilha2_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_trilha2_value}}}")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * {{{dados_cartao_impressao_response_trilha_c_v_v1_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_trilha_c_v_v1_value}}}")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * {{{dados_cartao_impressao_response_trilha_c_v_v2_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_trilha_c_v_v2_value}}}")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  
  /**
   * {{{dados_cartao_impressao_response_flag_virtual_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_flag_virtual_value}}}")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{dados_cartao_impressao_response_nome_bandeira_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_nome_bandeira_value}}}")
  public String getNomeBandeira() {
    return nomeBandeira;
  }
  public void setNomeBandeira(String nomeBandeira) {
    this.nomeBandeira = nomeBandeira;
  }

  
  /**
   * {{{dados_cartao_impressao_response_flag_titular_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_flag_titular_value}}}")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * {{{dados_cartao_impressao_response_sequencial_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_sequencial_cartao_value}}}")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_status_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_status_value}}}")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_status_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_descricao_status_cartao_value}}}")
  public String getDescricaoStatusCartao() {
    return descricaoStatusCartao;
  }
  public void setDescricaoStatusCartao(String descricaoStatusCartao) {
    this.descricaoStatusCartao = descricaoStatusCartao;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_status_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_data_status_value}}}")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_estagio_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_estagio_value}}}")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_estagio_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_descricao_estagio_value}}}")
  public String getDescricaoEstagio() {
    return descricaoEstagio;
  }
  public void setDescricaoEstagio(String descricaoEstagio) {
    this.descricaoEstagio = descricaoEstagio;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_estagio_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_data_estagio_value}}}")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * {{{dados_cartao_impressao_response_numero_bin_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_numero_bin_value}}}")
  public String getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(String numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_descricao_produto_value}}}")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_status_conta_value}}}")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_descricao_status_conta_value}}}")
  public Long getDescricaoStatusConta() {
    return descricaoStatusConta;
  }
  public void setDescricaoStatusConta(Long descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_embossing_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_data_embossing_value}}}")
  public String getDataEmbossing() {
    return dataEmbossing;
  }
  public void setDataEmbossing(String dataEmbossing) {
    this.dataEmbossing = dataEmbossing;
  }

  
  /**
   * {{{dados_cartao_impressao_response_codigo_desbloqueio_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_codigo_desbloqueio_value}}}")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * {{{dados_cartao_impressao_response_nome_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_nome_pessoa_value}}}")
  public String getNomePessoa() {
    return nomePessoa;
  }
  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  
  /**
   * {{{dados_cartao_impressao_response_tipo_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_tipo_pessoa_value}}}")
  public String getTipoPessoa() {
    return tipoPessoa;
  }
  public void setTipoPessoa(String tipoPessoa) {
    this.tipoPessoa = tipoPessoa;
  }

  
  /**
   * {{{dados_cartao_impressao_response_data_nascimento_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_data_nascimento_value}}}")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_endereco_value}}}")
  public Long getIdEndereco() {
    return idEndereco;
  }
  public void setIdEndereco(Long idEndereco) {
    this.idEndereco = idEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_tipo_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_tipo_endereco_value}}}")
  public Long getIdTipoEndereco() {
    return idTipoEndereco;
  }
  public void setIdTipoEndereco(Long idTipoEndereco) {
    this.idTipoEndereco = idTipoEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_descricao_tipo_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_descricao_tipo_endereco_value}}}")
  public String getDescricaoTipoEndereco() {
    return descricaoTipoEndereco;
  }
  public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
    this.descricaoTipoEndereco = descricaoTipoEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_cep_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_cep_value}}}")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{dados_cartao_impressao_response_logradouro_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_logradouro_value}}}")
  public String getLogradouro() {
    return logradouro;
  }
  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  
  /**
   * {{{dados_cartao_impressao_response_numero_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_numero_endereco_value}}}")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_complemento_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_complemento_endereco_value}}}")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * {{{dados_cartao_impressao_response_bairro_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_bairro_value}}}")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{dados_cartao_impressao_response_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{dados_cartao_impressao_response_uf_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_uf_value}}}")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{dados_cartao_impressao_response_pais_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_pais_value}}}")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{dados_cartao_impressao_response_senha_criptografada_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_senha_criptografada_value}}}")
  public String getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(String senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * {{{dados_cartao_impressao_response_icvv_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_icvv_value}}}")
  public String getIcvv() {
    return icvv;
  }
  public void setIcvv(String icvv) {
    this.icvv = icvv;
  }

  
  /**
   * {{{dados_cartao_impressao_response_id_status_impressao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_impressao_response_id_status_impressao_value}}}")
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



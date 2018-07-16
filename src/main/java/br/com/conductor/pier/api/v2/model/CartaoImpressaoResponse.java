package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{cartao_impressao_response_description}}}
 **/
@ApiModel(description = "{{{cartao_impressao_response_description}}}")
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
   * {{{cartao_impressao_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{cartao_impressao_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{cartao_impressao_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{cartao_impressao_response_id_bandeira_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_id_bandeira_value}}}")
  public Long getIdBandeira() {
    return idBandeira;
  }
  public void setIdBandeira(Long idBandeira) {
    this.idBandeira = idBandeira;
  }

  
  /**
   * {{{cartao_impressao_response_id_tipo_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_id_tipo_cartao_value}}}")
  public Long getIdTipoCartao() {
    return idTipoCartao;
  }
  public void setIdTipoCartao(Long idTipoCartao) {
    this.idTipoCartao = idTipoCartao;
  }

  
  /**
   * {{{cartao_impressao_response_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{cartao_impressao_response_nome_plastico_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_nome_plastico_value}}}")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{cartao_impressao_response_cvv2_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_cvv2_value}}}")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * {{{cartao_impressao_response_data_geracao_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_data_geracao_value}}}")
  public String getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(String dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * {{{cartao_impressao_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{cartao_impressao_response_nome_origem_comercial_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_nome_origem_comercial_value}}}")
  public String getNomeOrigemComercial() {
    return nomeOrigemComercial;
  }
  public void setNomeOrigemComercial(String nomeOrigemComercial) {
    this.nomeOrigemComercial = nomeOrigemComercial;
  }

  
  /**
   * {{{cartao_impressao_response_nome_empresa_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_nome_empresa_value}}}")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * {{{cartao_impressao_response_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_numero_agencia_value}}}")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{cartao_impressao_response_numero_conta_corente_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_numero_conta_corente_value}}}")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   * {{{cartao_impressao_response_nome_empresa_beneficio_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_nome_empresa_beneficio_value}}}")
  public String getNomeEmpresaBeneficio() {
    return nomeEmpresaBeneficio;
  }
  public void setNomeEmpresaBeneficio(String nomeEmpresaBeneficio) {
    this.nomeEmpresaBeneficio = nomeEmpresaBeneficio;
  }

  
  /**
   * {{{cartao_impressao_response_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{cartao_impressao_response_tipo_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_tipo_portador_value}}}")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * {{{cartao_impressao_response_nome_empregador_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_nome_empregador_value}}}")
  public String getNomeEmpregador() {
    return nomeEmpregador;
  }
  public void setNomeEmpregador(String nomeEmpregador) {
    this.nomeEmpregador = nomeEmpregador;
  }

  
  /**
   * {{{cartao_impressao_response_trilha1_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_trilha1_value}}}")
  public String getTrilha1() {
    return trilha1;
  }
  public void setTrilha1(String trilha1) {
    this.trilha1 = trilha1;
  }

  
  /**
   * {{{cartao_impressao_response_trilha2_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_trilha2_value}}}")
  public String getTrilha2() {
    return trilha2;
  }
  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }

  
  /**
   * {{{cartao_impressao_response_trilha_c_v_v1_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_trilha_c_v_v1_value}}}")
  public String getTrilhaCVV1() {
    return trilhaCVV1;
  }
  public void setTrilhaCVV1(String trilhaCVV1) {
    this.trilhaCVV1 = trilhaCVV1;
  }

  
  /**
   * {{{cartao_impressao_response_trilha_c_v_v2_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_trilha_c_v_v2_value}}}")
  public String getTrilhaCVV2() {
    return trilhaCVV2;
  }
  public void setTrilhaCVV2(String trilhaCVV2) {
    this.trilhaCVV2 = trilhaCVV2;
  }

  
  /**
   * {{{cartao_impressao_response_flag_virtual_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_flag_virtual_value}}}")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{cartao_impressao_response_numero_cartao_hash_value}}}
   **/
  @ApiModelProperty(value = "{{{cartao_impressao_response_numero_cartao_hash_value}}}")
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



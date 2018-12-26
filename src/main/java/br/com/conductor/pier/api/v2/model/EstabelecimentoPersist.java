package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ConsultaCadastroEstabelecimentoDTO;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros de requisi\u00E7\u00E3o de um estabelecimento
 **/
@ApiModel(description = "Par\u00E2metros de requisi\u00E7\u00E3o de um estabelecimento")
public class EstabelecimentoPersist  {
  
  @SerializedName("flagMatriz")
  private Integer flagMatriz = null;
  @SerializedName("idGrupoEconomico")
  private Long idGrupoEconomico = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("nomeLogradouro")
  private String nomeLogradouro = null;
  @SerializedName("numeroEndereco")
  private Integer numeroEndereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("cep2")
  private String cep2 = null;
  @SerializedName("nomeLogradouro2")
  private String nomeLogradouro2 = null;
  @SerializedName("numeroEndereco2")
  private Integer numeroEndereco2 = null;
  @SerializedName("bairro2")
  private String bairro2 = null;
  @SerializedName("cidade2")
  private String cidade2 = null;
  @SerializedName("complemento2")
  private String complemento2 = null;
  @SerializedName("uf2")
  private String uf2 = null;
  @SerializedName("obs")
  private String obs = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("flagArquivoSecrFazenda")
  private Integer flagArquivoSecrFazenda = null;
  @SerializedName("flagCartaoDigitado")
  private Integer flagCartaoDigitado = null;
  @SerializedName("inativo")
  private Integer inativo = null;
  @SerializedName("idMoeda")
  private Long idMoeda = null;
  @SerializedName("idPais")
  private Long idPais = null;
  @SerializedName("associadoSPCBrasil")
  private Integer associadoSPCBrasil = null;
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("idTipoEstabelecimento")
  private Long idTipoEstabelecimento = null;
  @SerializedName("correspondencia")
  private Integer correspondencia = null;
  @SerializedName("cargoContato")
  private String cargoContato = null;
  public enum TipoPagamentoEnum {
     CENTRALIZADO,  PV, 
  };
  @SerializedName("tipoPagamento")
  private TipoPagamentoEnum tipoPagamento = null;
  @SerializedName("consulta")
  private ConsultaCadastroEstabelecimentoDTO consulta = null;
  @SerializedName("consulta2")
  private ConsultaCadastroEstabelecimentoDTO consulta2 = null;
  @SerializedName("consulta3")
  private ConsultaCadastroEstabelecimentoDTO consulta3 = null;
  @SerializedName("flagTerminalVirtual")
  private Boolean flagTerminalVirtual = null;
  @SerializedName("flagConsultaExtrato")
  private Boolean flagConsultaExtrato = null;

  
  /**
   * Indica se \u00E9 matriz ou filial
   **/
  @ApiModelProperty(value = "Indica se \u00E9 matriz ou filial")
  public Integer getFlagMatriz() {
    return flagMatriz;
  }
  public void setFlagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
  }

  
  /**
   * Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Grupo Econ\u00F4mico
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero de identifica\u00E7\u00E3o do Grupo Econ\u00F4mico")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * N\u00FAmero Receita Federal
   **/
  @ApiModelProperty(value = "N\u00FAmero Receita Federal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Nome do Estabelecimento
   **/
  @ApiModelProperty(value = "Nome do Estabelecimento")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Raz\u00E3o Social do Estabelecimento
   **/
  @ApiModelProperty(value = "Raz\u00E3o Social do Estabelecimento")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * T\u00EDtulo Comercial do Estabelecimento
   **/
  @ApiModelProperty(value = "T\u00EDtulo Comercial do Estabelecimento")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * CEP do Estabelecimento
   **/
  @ApiModelProperty(value = "CEP do Estabelecimento")
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
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * N\u00FAmero do endere\u00E7o
   **/
  @ApiModelProperty(value = "N\u00FAmero do endere\u00E7o")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Nome do bairro do endere\u00E7o
   **/
  @ApiModelProperty(value = "Nome do bairro do endere\u00E7o")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Nome da cidade do endere\u00E7o
   **/
  @ApiModelProperty(value = "Nome da cidade do endere\u00E7o")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Descri\u00E7\u00F5es complementares referente ao endere\u00E7o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00F5es complementares referente ao endere\u00E7o")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o
   **/
  @ApiModelProperty(value = "Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Segundo CEP do estabelimento
   **/
  @ApiModelProperty(value = "Segundo CEP do estabelimento")
  public String getCep2() {
    return cep2;
  }
  public void setCep2(String cep2) {
    this.cep2 = cep2;
  }

  
  /**
   * Nome do Logradouro 
   **/
  @ApiModelProperty(value = "Nome do Logradouro ")
  public String getNomeLogradouro2() {
    return nomeLogradouro2;
  }
  public void setNomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
  }

  
  /**
   * N\u00FAmero do endere\u00E7o
   **/
  @ApiModelProperty(value = "N\u00FAmero do endere\u00E7o")
  public Integer getNumeroEndereco2() {
    return numeroEndereco2;
  }
  public void setNumeroEndereco2(Integer numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
  }

  
  /**
   * Nome do bairro do endere\u00E7o
   **/
  @ApiModelProperty(value = "Nome do bairro do endere\u00E7o")
  public String getBairro2() {
    return bairro2;
  }
  public void setBairro2(String bairro2) {
    this.bairro2 = bairro2;
  }

  
  /**
   * Nome da cidade do endere\u00E7o
   **/
  @ApiModelProperty(value = "Nome da cidade do endere\u00E7o")
  public String getCidade2() {
    return cidade2;
  }
  public void setCidade2(String cidade2) {
    this.cidade2 = cidade2;
  }

  
  /**
   * Descri\u00E7\u00F5es complementares referente ao endere\u00E7o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00F5es complementares referente ao endere\u00E7o")
  public String getComplemento2() {
    return complemento2;
  }
  public void setComplemento2(String complemento2) {
    this.complemento2 = complemento2;
  }

  
  /**
   * Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o
   **/
  @ApiModelProperty(value = "Sigla de identifica\u00E7\u00E3o da Unidade Federativa do endere\u00E7o")
  public String getUf2() {
    return uf2;
  }
  public void setUf2(String uf2) {
    this.uf2 = uf2;
  }

  
  /**
   * Detalhes espec\u00EDficos quanto ao Cadastro do Estabelecimento
   **/
  @ApiModelProperty(value = "Detalhes espec\u00EDficos quanto ao Cadastro do Estabelecimento")
  public String getObs() {
    return obs;
  }
  public void setObs(String obs) {
    this.obs = obs;
  }

  
  /**
   * Nome da pessoa para contato com o Estabelecimento
   **/
  @ApiModelProperty(value = "Nome da pessoa para contato com o Estabelecimento")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * E-mail da pessoa para contato com o Estabelecimento
   **/
  @ApiModelProperty(value = "E-mail da pessoa para contato com o Estabelecimento")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indica se o estabelecimento ser\u00E1 inclu\u00EDdo no arquivo de registro para a Secretaria da Fazenda Estadual
   **/
  @ApiModelProperty(value = "Indica se o estabelecimento ser\u00E1 inclu\u00EDdo no arquivo de registro para a Secretaria da Fazenda Estadual")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * Indica se o estabelecimento poder\u00E1 originar transa\u00E7\u00F5es sem a leitura da tarja ou do chip do cart\u00E3o
   **/
  @ApiModelProperty(value = "Indica se o estabelecimento poder\u00E1 originar transa\u00E7\u00F5es sem a leitura da tarja ou do chip do cart\u00E3o")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * Indica se o estabelecimento est\u00E1 inativo
   **/
  @ApiModelProperty(value = "Indica se o estabelecimento est\u00E1 inativo")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  
  /**
   * C\u00F3digo identificador da moeda
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da moeda")
  public Long getIdMoeda() {
    return idMoeda;
  }
  public void setIdMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
  }

  
  /**
   * Identificador de Pa\u00EDs
   **/
  @ApiModelProperty(value = "Identificador de Pa\u00EDs")
  public Long getIdPais() {
    return idPais;
  }
  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  
  /**
   * N\u00FAmero do associado ao SPCBrasil
   **/
  @ApiModelProperty(value = "N\u00FAmero do associado ao SPCBrasil")
  public Integer getAssociadoSPCBrasil() {
    return associadoSPCBrasil;
  }
  public void setAssociadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
  }

  
  /**
   * C\u00F3digo de Categoria de Mercado
   **/
  @ApiModelProperty(value = "C\u00F3digo de Categoria de Mercado")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de Estabelecimento
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de Estabelecimento")
  public Long getIdTipoEstabelecimento() {
    return idTipoEstabelecimento;
  }
  public void setIdTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
  }

  
  /**
   * Indicador para qual endere\u00E7o as correspond\u00EAncias ser\u00E3o enviadas, onde 1 \u00E9 ORIGEM e 2 ENDERE\u00C7O DE CORRESPOND\u00CANCIA
   **/
  @ApiModelProperty(value = "Indicador para qual endere\u00E7o as correspond\u00EAncias ser\u00E3o enviadas, onde 1 \u00E9 ORIGEM e 2 ENDERE\u00C7O DE CORRESPOND\u00CANCIA")
  public Integer getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * Cargo do contato do estabelecimento
   **/
  @ApiModelProperty(value = "Cargo do contato do estabelecimento")
  public String getCargoContato() {
    return cargoContato;
  }
  public void setCargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
  }

  
  /**
   * Tipo do regime de pagamento do estabelecimento
   **/
  @ApiModelProperty(value = "Tipo do regime de pagamento do estabelecimento")
  public TipoPagamentoEnum getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * Consulta de cadastro n\u00FAmero um
   **/
  @ApiModelProperty(value = "Consulta de cadastro n\u00FAmero um")
  public ConsultaCadastroEstabelecimentoDTO getConsulta() {
    return consulta;
  }
  public void setConsulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
  }

  
  /**
   * Consulta de cadastro n\u00FAmero dois
   **/
  @ApiModelProperty(value = "Consulta de cadastro n\u00FAmero dois")
  public ConsultaCadastroEstabelecimentoDTO getConsulta2() {
    return consulta2;
  }
  public void setConsulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
  }

  
  /**
   * Consulta de cadastro n\u00FAmero tr\u00EAs
   **/
  @ApiModelProperty(value = "Consulta de cadastro n\u00FAmero tr\u00EAs")
  public ConsultaCadastroEstabelecimentoDTO getConsulta3() {
    return consulta3;
  }
  public void setConsulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
  }

  
  /**
   * Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o))
   **/
  @ApiModelProperty(required = true, value = "Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o))")
  public Boolean getFlagTerminalVirtual() {
    return flagTerminalVirtual;
  }
  public void setFlagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
  }

  
  /**
   * Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o))
   **/
  @ApiModelProperty(required = true, value = "Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o))")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstabelecimentoPersist {\n");
    
    sb.append("  flagMatriz: ").append(flagMatriz).append("\n");
    sb.append("  idGrupoEconomico: ").append(idGrupoEconomico).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  cep2: ").append(cep2).append("\n");
    sb.append("  nomeLogradouro2: ").append(nomeLogradouro2).append("\n");
    sb.append("  numeroEndereco2: ").append(numeroEndereco2).append("\n");
    sb.append("  bairro2: ").append(bairro2).append("\n");
    sb.append("  cidade2: ").append(cidade2).append("\n");
    sb.append("  complemento2: ").append(complemento2).append("\n");
    sb.append("  uf2: ").append(uf2).append("\n");
    sb.append("  obs: ").append(obs).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  flagArquivoSecrFazenda: ").append(flagArquivoSecrFazenda).append("\n");
    sb.append("  flagCartaoDigitado: ").append(flagCartaoDigitado).append("\n");
    sb.append("  inativo: ").append(inativo).append("\n");
    sb.append("  idMoeda: ").append(idMoeda).append("\n");
    sb.append("  idPais: ").append(idPais).append("\n");
    sb.append("  associadoSPCBrasil: ").append(associadoSPCBrasil).append("\n");
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  idTipoEstabelecimento: ").append(idTipoEstabelecimento).append("\n");
    sb.append("  correspondencia: ").append(correspondencia).append("\n");
    sb.append("  cargoContato: ").append(cargoContato).append("\n");
    sb.append("  tipoPagamento: ").append(tipoPagamento).append("\n");
    sb.append("  consulta: ").append(consulta).append("\n");
    sb.append("  consulta2: ").append(consulta2).append("\n");
    sb.append("  consulta3: ").append(consulta3).append("\n");
    sb.append("  flagTerminalVirtual: ").append(flagTerminalVirtual).append("\n");
    sb.append("  flagConsultaExtrato: ").append(flagConsultaExtrato).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

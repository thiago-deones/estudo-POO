import React from "react";
import { Button } from "../Button";

import {
    BuscarInputContainer,
    Container,
    Input,
    Menu,
    MenuRight,
    Row,
    UserPicture,
    Wrapper
} from "./stelys";
import { Button } from "../Button";

const Header = () => {
    return (
        <Wrapper>
            <Container>
                <Row>
                    <img src="/assets/logo-dio.png" alt="Logo da Dio" />
                    <BuscarInputContainer>
                        <Input placeholder="Buscar..."/>
                    </BuscarInputContainer>
                    <Menu></Menu>
                    <Button title="Cadastrar"/>
                </Row>
                <Row>
                    <Button title="Entrar"/>
                    <Button title="Cadastrar"/>
                </Row>
            </Container>        
                <MenuRight href="#">Home</MenuRight>
        </Wrapper>

    )
}

export { Header }